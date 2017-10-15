package me.rmrf.tag;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class QueryTag extends SimpleTagSupport {
	private String driver;
	private String url;
	private String user;
	private String pass;
	private String sql;
	private Connection conn = null;
	private Statement statement = null;
	private ResultSet rs = null;
	private ResultSetMetaData rsmd = null;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public Statement getStatement() {
		return statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public ResultSetMetaData getRsmd() {
		return rsmd;
	}

	public void setRsmd(ResultSetMetaData rsmd) {
		this.rsmd = rsmd;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	public String getSql() {
		return sql;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	@Override
	public void doTag() throws JspException {
		try {
			Class.forName(this.driver);
			this.conn = DriverManager.getConnection(this.url,this.user,this.pass);
			this.statement = conn.createStatement();
			this.rs = statement.executeQuery(this.sql);
			this.getJspContext().getOut().println("当前用户总数：");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
