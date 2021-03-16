package com.ws.jwt;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.model.data.Utente;
import com.ws.jdbc.JdbcUtils;
import com.ws.mappers.UserRM;
import com.ws.util.Util;

@Component
public class Autorizzator implements UserDetailsService{
	
	private String typeUser;
	
	@Autowired
	private JdbcUtils jdbcUtil;
	
	@Value("${get.user.by.email}")
	protected String queryGetUserByEmail;
	
	@Autowired
	private UserRM userRowMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			Utente response = jdbcUtil.queryForObject(queryGetUserByEmail, new Object[]{username}, userRowMapper);
			return Util.getResponseOK(response, null).getBody().getObj();
		} catch (DataAccessException | SQLException e) {
			return null;
		}
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}

	

}
