package com.ws.mappers;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.model.data.Utente;

@Component
public class UserRM implements RowMapper<Utente> {
	

	@Override
	public Utente mapRow(ResultSet rs, int rowNum) throws SQLException {
		return mapUser(rs);
	}

	public Utente mapUser(ResultSet rs) throws SQLException {
		Utente user = null;
			user = new Utente();
			user.setEmail(hasColumn(rs, "email") ? rs.getString("email") : "");	
		return user;
	}
	
	public boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
	    ResultSetMetaData rsmd = rs.getMetaData();
	    int columns = rsmd.getColumnCount();
	    for (int x = 1; x <= columns; x++) {
	        if (columnName.equalsIgnoreCase(rsmd.getColumnName(x))) {
	            return true;
	        }
	    }
	    return false;
	}

}
