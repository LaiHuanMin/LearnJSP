package me.rmrf.tag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLExector {
	public static ResultSet exec(String sql) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmrf", "root", "123456");
			ResultSet resultSet = conn.createStatement().executeQuery(sql);
			return resultSet;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static int getUserCount() throws SQLException {
		ResultSet resultSet = SQLExector.exec("select count(id) as userCount from user");
		while (resultSet.next()) {
			return resultSet.getInt("userCount");
		}
		return 0;
	}
}
