package me.rmrf.dao.vo;

import java.util.Date;

public class Emp {
	public Emp(int emp_no,Date hire_date,Date birth_date,String first_name,String last_name,String gender) {
		this.birth_date = birth_date;
		this.emp_no = emp_no;
		this.gender = gender;
		this.first_name = first_name;
		this.hire_date = hire_date;
		this.last_name = last_name;
		// TODO Auto-generated constructor stub
	}
	private int emp_no;
	private Date hire_date;
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	private String gender;
	private Date birth_date;
	private String last_name;
	private String first_name;
}
