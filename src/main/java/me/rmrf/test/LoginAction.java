package me.rmrf.test;

interface Action{
	public final String SUCCESS = "success";
	public final String FAIL = "FAIL";
}

public class LoginAction implements Action{
	public String execute() throws Exception {
		return this.SUCCESS;
	}
}
