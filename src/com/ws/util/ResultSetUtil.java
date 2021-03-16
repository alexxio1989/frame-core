package com.ws.util;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Date;

public class ResultSetUtil {
	
	public static boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
	    ResultSetMetaData rsmd = rs.getMetaData();
	    int columns = rsmd.getColumnCount();
	    for (int x = 1; x <= columns; x++) {
	        if (columnName.equalsIgnoreCase(rsmd.getColumnName(x))) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static String getString(ResultSet rs, String columnName) throws SQLException {
	    if(hasColumn(rs, columnName)) {
	    	return rs.getString(columnName);
	    }
	    return null;
	}
	
	public static int getInt(ResultSet rs, String columnName) throws SQLException {
	    if(hasColumn(rs, columnName)) {
	    	return rs.getInt(columnName);
	    }
	    return 0;
	}
	
	public static BigDecimal getBigDecimal(ResultSet rs, String columnName) throws SQLException {
	    if(hasColumn(rs, columnName)) {
	    	return rs.getBigDecimal(columnName);
	    }
	    return new BigDecimal(0);
	}
	
	public static boolean getBoolean(ResultSet rs, String columnName) throws SQLException {
	    if(hasColumn(rs, columnName)) {
	    	return rs.getBoolean(columnName);
	    }
	    return false;
	}
	
	public static byte[] getBytes(ResultSet rs, String columnName) throws SQLException {
	    if(hasColumn(rs, columnName)) {
	    	return rs.getBytes(columnName);
	    }
	    return new byte [0];
	}
	
	public static Date getDate(ResultSet rs, String columnName) throws SQLException {
	    if(hasColumn(rs, columnName)) {
	    	return rs.getDate(columnName);
	    }
	    return null;
	}
	
	

}
