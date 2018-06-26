package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	@Override
	public List<Department> getAllDepartments() {
		ArrayList<Department> departments = new ArrayList<Department>();
		String sqlGetDepartment = "SELECT * FROM department";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetDepartment);
		while (results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		ArrayList<Department> departments = new ArrayList<Department>();
		String sqlSearchDeptByName = "SELECT * FROM department WHERE name ILIKE(?)";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchDeptByName, "%" + nameSearch + "%");
		while (results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
	String sqlInsertDepartment = "UPDATE department SET name = ? WHERE department_id = ?";
	jdbcTemplate.update(sqlInsertDepartment, updatedDepartment.getName(), updatedDepartment.getId());
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		String sqlInsertDepartment = "INSERT INTO department(department_id, name) Values (?, ?)";
		newDepartment.setId(getNextDepartmentId());
		jdbcTemplate.update(sqlInsertDepartment, newDepartment.getId(), newDepartment.getName());
		
		return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		Department theDept = null;
		String sqlFindDeptById = "SELECT department_id, name FROM department Where department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindDeptById, id);
		
		if (results.next()) {
			theDept = mapRowToDepartment(results);
		}
		return theDept;
	}
	
	private long getNextDepartmentId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_department_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new department");
		}
	}
	
  private Department mapRowToDepartment(SqlRowSet results) {
	  Department theDepartment = new Department();
	  theDepartment.setId(results.getLong("department_id"));
	  theDepartment.setName(results.getString("name"));
	  return theDepartment;
  }

}
