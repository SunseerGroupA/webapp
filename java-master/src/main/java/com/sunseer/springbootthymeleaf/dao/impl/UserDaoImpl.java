package com.sunseer.springbootthymeleaf.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sunseer.springbootthymeleaf.dao.UsersDao;
import com.sunseer.springbootthymeleaf.pojo.UserTable;

@Repository
public class UserDaoImpl implements UsersDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertUsers(UserTable users) {
		String sql = "insert into users(username,userage,usersex,"
				+ "userdepartment,useraddress,usermail,userfinaleducation,userskill)"
				+ " values (?,?,?,?,?,?,?,?)";
		this.jdbcTemplate.update(sql, users.getUsername(), users.getUserage(), users.getUsersex()
				,users.getUserdepartment(),users.getUseraddress(),
				users.getUsermail(),users.getUserfinaleducation(),users.getUserskill());

	}

	@Override
	public List<UserTable> selectUsersAll() {
		String sql = "select * from users";
		return this.jdbcTemplate.query(sql, new RowMapper() {
			/**
			 * Resultsetのマーピング
			 */
			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserTable usertable = new UserTable();
				usertable.setUserid(rs.getInt("userid"));
				usertable.setUsername(rs.getString("username"));
				usertable.setUserage(rs.getInt("userage"));
				usertable.setUsersex(rs.getString("usersex"));
				usertable.setUserdepartment(rs.getString("userdepartment"));
				usertable.setUseraddress(rs.getString("useraddress"));
				usertable.setUsermail(rs.getString("usermail"));
				usertable.setUserfinaleducation(rs.getString("userfinaleducation"));
				usertable.setUserskill(rs.getString("userskill"));
	//			usertable.setUsertel(rs.getString("usertel"));
				return usertable;
			}
		});
	}

	@Override
	public UserTable selectUserById(Integer id) {
		String sql = "select * from users where userid = ?";
		UserTable user= new UserTable();
		Object[] arr = new Object[] {id};
		this.jdbcTemplate.query(sql, arr, new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {
				user.setUserid(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setUserage(rs.getInt("userage"));
				user.setUsersex(rs.getString("usersex"));
				user.setUserdepartment(rs.getString("userdepartment"));
				user.setUseraddress(rs.getString("useraddress"));
				user.setUsermail(rs.getString("usermail"));
				user.setUserfinaleducation(rs.getString("userfinaleducation"));
				user.setUserskill(rs.getString("userskill"));
	//			user.setUsertel(rs.getString("usertel"));
			}
		});
		return user;
	}

	@Override
	public void updateusers(UserTable users) {
		String sql = "update users set username = ?, usersex=? where userid = ?"
				+ " where usermail=? where userdepartment=? where useraddress= ?"
				+ " where userfinaleducation=? where userskill= ? ";

		this.jdbcTemplate.update(sql, users.getUsername(),users.getUsersex(), users.getUserid(),
				users.getUserage(),users.getUserdepartment(),
				users.getUseraddress(),users.getUsermail()
				,users.getUserfinaleducation(),users.getUserskill());
	}

	@Override
	public void deleteuserById(Integer id) {
		String sql = "delete from users where userid = ?";
		this.jdbcTemplate.update(sql, id);

	}

}
