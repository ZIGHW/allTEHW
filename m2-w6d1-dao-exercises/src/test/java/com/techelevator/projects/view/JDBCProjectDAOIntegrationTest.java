package com.techelevator.projects.view;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;



public class JDBCProjectDAOIntegrationTest {
	private static SingleConnectionDataSource dataSource;
	private JDBCProjectDAO dao;
	private JDBCEmployeeDAO daoEmployee;
	private static final String TEST_PROJECT = "Hang_Out";
	
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projectInfo");
		dataSource.setUsername("postgres");
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	
	@Before
	public void setup() {
		Date from_date = Date.valueOf("1433-03-01");
		Date to_date = Date.valueOf("2019-03-01");
		String sqlInsertProject = "INSERT INTO project (project_id, name, from_date, to_date) Values(100, ?, ?, ?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertProject, TEST_PROJECT, from_date, to_date);
		dao = new JDBCProjectDAO(dataSource);
		daoEmployee = new JDBCEmployeeDAO(dataSource);
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void testGetAllActiveProjects() {
		List<Project> results = dao.getAllActiveProjects();
		Assert.assertNotNull(results);
		Assert.assertEquals(3, results.size());
		Assert.assertEquals("The Never-ending Project", results.get(0).getName());
	}
	
	
	@Test
	public void testAddAndRemoveEmployeeFromProject() {
		Long employeeID = daoEmployee.getAllEmployees().get(7).getId();
		Long projectID = dao.getAllActiveProjects().get(0).getId();
		int numBeforeAddingEmployee = daoEmployee.getEmployeesByProjectId(projectID).size();
		
		dao.addEmployeeToProject (projectID, employeeID);
		Assert.assertEquals(numBeforeAddingEmployee + 1, daoEmployee.getEmployeesByProjectId(projectID).size());
		dao.removeEmployeeFromProject(projectID, employeeID);
		Assert.assertEquals(numBeforeAddingEmployee, daoEmployee.getEmployeesByProjectId(projectID).size());
	}
}
