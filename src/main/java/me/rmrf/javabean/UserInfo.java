package me.rmrf.javabean;

public class UserInfo {
	private String username = null;
	private String password = null;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String echo(String what) {
		return "what";
	}
}
