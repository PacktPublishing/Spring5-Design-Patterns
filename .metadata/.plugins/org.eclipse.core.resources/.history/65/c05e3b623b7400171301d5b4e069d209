/**
 * 
 */
package com.doj.springapp.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.doj.springapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class JdbcTransferRepository implements TransferRepository {
	
	JdbcTemplate jdbcTemplate;
	
	public JdbcTransferRepository(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void tranfer(Long amount, Account account) {
		String sql = "UPDATE Account SET balance = "+amount+" WHERE id ="+account.getId();
		jdbcTemplate.update(sql);
	}

}
