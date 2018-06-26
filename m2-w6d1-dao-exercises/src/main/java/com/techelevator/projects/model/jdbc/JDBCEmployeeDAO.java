package com.techelevator.projects.model.jdbc;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
	    List<Employee> employees = new ArrayList<Employee>();
		String sqlGetEmployees = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployees);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sqlFindEmployeeByName = "";
		lastNameSearch = "%" + lastNameSearch + "%";
		firstNameSearch = "%" + firstNameSearch + "%"; 
		if (firstNameSearch.equals("")) {
			 sqlFindEmployeeByName = "SELECT * FROM employee Where last_name ILIKE '" + lastNameSearch + "'";
		} else if (lastNameSearch.equals("")) {
		     sqlFindEmployeeByName = "SELECT * FROM employee Where first_name ILIKE '" + firstNameSearch + "'";
		} else {
			sqlFindEmployeeByName = "SELECT * FROM employee Where first_name ILIKE '" + firstNameSearch +  "' AND last_name LIKE '" + lastNameSearch + "'";
		}
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlFindEmployeeByName);
		while (results.next()) {
			Employee theEmp = mapRowToEmployee(results);
			employees.add(theEmp);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sqlGetEmployeeByDeptId = "SELECT * FROM employee WHERE department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeeByDeptId, id);
		while (results.next()) {
			Employee theEmp = mapRowToEmployee(results);
			employees.add(theEmp);
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sqlGetEmployeesWOPRoj = "SELECT DISTINCT employee.* FROM employee LEFT OUTER JOIN project_employee ON employee.employee_id = project_employee.employee_id LEFT OUTER JOIN project "
		+ " ON project_employee.project_id = project.project_id "
		+ " WHERE project.project_id IS NULL ";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesWOPRoj);
		while (results.next()) {
			Employee theEmp = mapRowToEmployee(results);
			employees.add(theEmp);
		}
		return employees;
		
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		String sqlGetEmployeesByProjectId = "SELECT * FROM employee JOIN project_employee ON employee.employee_id = project_employee.employee_id WHERE project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetEmployeesByProjectId, projectId);
		while (results.next()) {
			Employee theEmp = mapRowToEmployee(results);
			employees.add(theEmp);
		}
		return employees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		String sqlChangeEmployeeDept = "UPDATE employee SET department_id = ? WHERE employee_id = ?";
		jdbcTemplate.update(sqlChangeEmployeeDept, departmentId, employeeId);
		
	}
	
	 private Employee mapRowToEmployee(SqlRowSet results) {
		  Employee theEmp = new Employee();
		  theEmp.setDepartmentId(results.getLong("department_id"));
		  theEmp.setId(results.getLong("employee_id"));
		  theEmp.setFirstName(results.getString("first_name"));
		  theEmp.setLastName(results.getString("last_name"));
		  theEmp.setBirthDay(results.getDate("birth_date").toLocalDate());
		  theEmp.setGender(results.getString("gender").charAt(0));
		  theEmp.setHireDate(results.getDate("hire_date").toLocalDate());
		  return theEmp;
	  }


}
