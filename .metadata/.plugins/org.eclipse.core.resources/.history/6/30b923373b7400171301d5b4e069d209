package com.packt.patterninspring.chapter7.bankapp.repository;

import java.io.Writer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.packt.patterninspring.chapter7.bankapp.callbacks.AccountExtractor;
import com.packt.patterninspring.chapter7.bankapp.callbacks.AccountReportWriter;
import com.packt.patterninspring.chapter7.bankapp.model.Account;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
public class JdbcAccountRepository implements AccountRepository{
	
	JdbcTemplate jdbcTemplate;
	
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Account findAccountById(Long id){
		String sql = "SELECT * FROM Account WHERE id = "+id;
		return jdbcTemplate.queryForObject(sql, new RowMapper<Account>(){
			@Override
			public Account mapRow(ResultSet rs, int arg1) throws SQLException {
				Account account = new Account(id);
				account.setName(rs.getString("name"));
				account.setBalance(new Long(rs.getInt("balance")));
				return account;
			}
		});
	}

	@Override
	public void generateReport(Writer out, String city) {
		String sql = "SELECT * FROM Account WHERE city = "+city;
		jdbcTemplate.query(sql, new AccountReportWriter());
	}

	@Override
	public List<Account> extractAccounts() {
		String sql = "SELECT * FROM Account";
		return jdbcTemplate.query(sql, new AccountExtractor());
	}
	
	/*@Override
	public Account findAccountById(Long id){
		String sql = "SELECT * FROM Account WHERE id = "+id;
		return jdbcTemplate.queryForObject(sql, new AccountRowMapper());
	}*/
}
