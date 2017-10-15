
package me.rmrf.tag;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.*;

public class Test {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmrf","root","123456");
		ResultSet resultSet = conn.createStatement().executeQuery("select count(id) as userCount from user");
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
	}

}
