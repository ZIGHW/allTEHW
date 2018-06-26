package com.techelevator.projects.model.jdbc;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		ArrayList<Project> projects = new ArrayList<Project>();
		String sqlgetAllActiveProjs = "SELECT * FROM project WHERE (from_date IS NOT NULL AND from_date < now() AND (to_date IS NULL OR to_date > now()))";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlgetAllActiveProjs);
		while (results.next()) {
			Project theProj = mapRowToProject(results);
			projects.add(theProj);
		}
		return projects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sqlRemoveEmpFromProj = "DELETE FROM project_employee WHERE employee_id = ? AND project_id = ?";
		jdbcTemplate.update(sqlRemoveEmpFromProj, employeeId, projectId);
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sqlAddEmpToProj = "INSERT INTO project_employee(project_id, employee_id) VALUES(?, ?)";
		jdbcTemplate.update(sqlAddEmpToProj, projectId, employeeId);
	}
	
	private Project mapRowToProject(SqlRowSet results) {
		Project theProj = new Project();
		theProj.setId(results.getLong("project_id"));
		theProj.setName(results.getString("name"));
		if (results.getDate("from_date") != null) {
			theProj.setStartDate(results.getDate("from_date").toLocalDate());
		}
		
		if (results.getDate("to_date") != null) {
			theProj.setEndDate(results.getDate("to_date").toLocalDate());
		}
		
		return theProj;
		
	}
	
	
	

}
