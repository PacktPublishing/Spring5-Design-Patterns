package com.packt.patterninspring.chapter7.bankapp.repository;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter7.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
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
