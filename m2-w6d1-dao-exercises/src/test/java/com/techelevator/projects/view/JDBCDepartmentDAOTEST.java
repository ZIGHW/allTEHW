package com.techelevator.projects.view;

import java.sql.SQLException;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;

public class JDBCDepartmentDAOTEST {
	private static SingleConnectionDataSource dataSource;
	private JDBCDepartmentDAO dao;
	private static final String TEST_DEPARTMENT = "Legends";
	
	
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
		String sqlInsertDepartment = "INSERT INTO department (department_id, name) Values(100, ?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertDepartment, TEST_DEPARTMENT);
		dao = new JDBCDepartmentDAO(dataSource);
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Test
	public void testGetAllDepartments() {
		List<Department> results = dao.getAllDepartments();
		assertNotNull(results);
		assertEquals(6, results.size());
	}
	
	@Test 
	public void testCreateDepartmentAndGetDepartmentById() {
		Department dep = new Department();
		dep.setName("Ultimate_Legends");
		dao.createDepartment(dep);
		Department depRevived = dao.getDepartmentById(dep.getId());
		Assert.assertNotEquals(null, depRevived);
		assertDepartmentsAreEqual(dep, depRevived);
	}
	
	@Test 
	public void testSearchDepartmentByName() {
		Department dep = new Department();
		dep.setName("Ultimate_Legends");
		dao.createDepartment(dep);
		List<Department> departments = dao.searchDepartmentsByName(dep.getName());
		Assert.assertNotNull(departments);
		Assert.assertEquals(1, departments.size());
		assertDepartmentsAreEqual(dep, departments.get(0));
	}
	
	public void testSaveDepartment() {
		List<Department> ledges = dao.searchDepartmentsByName("Legends");
		Department ledge = ledges.get(0);
		ledge.setName("Super_Legends");
		dao.saveDepartment(ledge);
		Department ledgeRevived = dao.getDepartmentById(ledge.getId());
		Assert.assertEquals(ledge.getId(), ledgeRevived.getId());
		Assert.assertEquals("Super_Legends", ledgeRevived.getName());
	}
	
	private void assertDepartmentsAreEqual(Department expected, Department actual) {
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getName(), actual.getName());
	}

}
