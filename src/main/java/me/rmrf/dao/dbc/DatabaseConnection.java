package me.rmrf.dao.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements IDatabaseConnection{
	private String DB_USER = "root";
	private String DB_PASS = "123456";
	private String DB_URL = "jdbc:mysql://localhost:3306/employees";
	private String DB_DRIVER = "com.mysql.jdbc.Driver";
	private Connection connection;

	public DatabaseConnection() throws ClassNotFoundException, SQLException {
		Class.forName(this.DB_DRIVER);
		this.connection = DriverManager.getConnection(this.DB_URL, this.DB_USER, this.DB_PASS);
	}

	public Connection getConnection() {
		return this.connection;
	}

	public void close() throws SQLException {
		this.connection.close();
	}

}


interface IDatabaseConnection{
	public Connection getConnection();
	public void close() throws SQLException;
}
