package com.cts.jdbcexample;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveUser(User user) {
		String query = "insert into User values('" + user.getId() + "','" + user.getName() + "','" + user.getSalary()
				+ "')";

		return jdbcTemplate.update(query);

	}
}
