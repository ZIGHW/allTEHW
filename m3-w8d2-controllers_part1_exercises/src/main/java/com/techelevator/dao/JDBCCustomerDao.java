package com.techelevator.dao;

import com.techelevator.dao.model.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort) {
		List<Customer> customers = new ArrayList<>();
		String filmSearchSql = "SELECT * FROM customer WHERE first_name ILIKE ? OR last_name ILIKE ? ORDER BY " + sort;
		System.out.println(sort);
		SqlRowSet results = jdbcTemplate.queryForRowSet(filmSearchSql, "%" + search + "%", "%" + search + "%");
	
		while(results.next()) {
	        customers.add(mapRowToCustomer(results));
	    }
		return customers;
	}
	//email, first_name, last_name, activebool
	
	private Customer mapRowToCustomer(SqlRowSet results) {
		Customer c = new Customer();
		c.setActive(results.getBoolean("activebool"));
		c.setEmail(results.getString("email"));
		c.setFirstName(results.getString("first_name"));
		c.setLastName(results.getString("last_name"));
		return c;
	}
    
}



//public List<Film> getFilmsBetween(String genre, int minLength, int maxLength) {
//    List<Film> matchingFilms = new ArrayList<>();
//    
//    String filmSearchSql = "SELECT title, description, release_year, length, rating FROM film " +
//    "JOIN film_category ON film_category.film_id = film.film_id JOIN category ON category.category_id = film_category.category_id "+
//    "WHERE category.name = ? AND length BETWEEN ? AND ?";
//    SqlRowSet results = jdbcTemplate.queryForRowSet(filmSearchSql, genre, minLength, maxLength);
//    while(results.next()) {
//        matchingFilms.add(mapRowToFilm(results));
//    }
//    return matchingFilms;
//}
//
//private Film mapRowToFilm(SqlRowSet results) {
//    Film filmRow = new Film();
//    filmRow.setTitle(results.getString("title"));
//    filmRow.setDescription(results.getString("description"));
//    filmRow.setReleaseYear(results.getInt("release_year"));
//    filmRow.setLength(results.getInt("length"));
//    filmRow.setRating(results.getString("rating"));
//    return filmRow;
//}