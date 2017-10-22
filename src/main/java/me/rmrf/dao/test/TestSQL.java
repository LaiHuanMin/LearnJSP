package me.rmrf.dao.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import me.rmrf.dao.dbc.DatabaseConnection;

public class TestSQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		DatabaseConnection dc = new DatabaseConnection();
		Connection conn = dc.getConnection();
		Statement statement = conn.createStatement();
		ResultSet result = statement.executeQuery("select * from emp");
		while(result.next()) {
			System.out.println(result.getString("emp_no"));
		}
		dc.close();
	}
	
}
