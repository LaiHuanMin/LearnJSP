
package me.rmrf.tag;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class Test {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmrf","root","123456");
		Statement statement = conn.createStatement();
		ResultSet executeQuery = statement.executeQuery("select * from user");
		while(executeQuery.next()) {
			System.out.println(executeQuery.getString("username")+executeQuery.getString("password"));
		}
	}

}
