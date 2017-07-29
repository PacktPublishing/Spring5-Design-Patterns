/**
 * 
 */
package com.doj.springapp.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.doj.springapp.model.Account;
import com.doj.springapp.rowmapper.AccountRowMapper;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
//@Order(1)
//@Primary
public class JdbcAccountRepository implements AccountRepository{
	
	JdbcTemplate jdbcTemplate;
	
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}



	/*@Override
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
	}*/
	
	@Override
	public Account findAccountById(Long id){
		String sql = "SELECT * FROM Account WHERE id = "+id;
		return jdbcTemplate.queryForObject(sql, new AccountRowMapper());
	}



	@Override
	public List<Account> findAll() {
		String sql = "SELECT * FROM Account";
		return jdbcTemplate.query(sql, new AccountRowMapper());
	}



	@Override
	public Long save(Account account) {
		String sql = "INSERT INTO ACCOUNT VALUE ()";
		//return jdbcTemplate.update(sql);
		return null;
	}
}
