package me.rmrf.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class FirstListener
 *
 */
public class FirstListener implements ServletContextListener {

	/**
	 * Default constructor.
	 */
	public FirstListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		ServletContext application = arg0.getServletContext();
		String user = application.getInitParameter("mysqlUser");
		String pass = application.getInitParameter("mysqlPass");
		String port = application.getInitParameter("mysqlPort");
		String url = application.getInitParameter("mysqlURL");
		String database = application.getInitParameter("mysqlDatabase");
		String completeURL = String.format("jdbc:mysql://%s:%s/%s", url, port, database);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(completeURL, user, pass);
			application.setAttribute("connection", conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

}
