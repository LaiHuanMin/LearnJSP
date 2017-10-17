package me.rmrf.test;

import java.sql.*;

public class ConnectionControl {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "123456");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select max(emp_no) from emp");
			while (result.next()) {
				System.out.println(result.getString(1));
			}

			statement.execute("insert into stuent (id,name) values(1000,'ok');");
			statement.execute("insert into stuent (id,name) values(30,'ok');");
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
