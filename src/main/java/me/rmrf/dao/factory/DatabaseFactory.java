package me.rmrf.dao.factory;

import java.sql.SQLException;

import me.rmrf.dao.dbc.DatabaseConnection;

public class DatabaseFactory {
	private DatabaseFactory() {
		
	}
	public static DatabaseConnection getDatabaseConnection() throws ClassNotFoundException, SQLException {
		return new DatabaseConnection();
	}
}
