package me.rmrf.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import me.rmrf.dao.dao.IEmpDAO;
import me.rmrf.dao.vo.Emp;

public class EmpDAOImpl implements IEmpDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;

	public EmpDAOImpl(Connection connection) {
		this.connection = connection;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean doCreate(Emp emp) throws Exception {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "insert into emp (emp_no,birth_date,first_name,last_name,gender,hire_date) values(?,?,?,?,?,?);";
		this.preparedStatement = this.connection.prepareStatement(sql);
		this.preparedStatement.setInt(1, emp.getEmp_no());
		this.preparedStatement.setDate(2, new java.sql.Date(emp.getBirth_date().getTime()));
		this.preparedStatement.setString(3, emp.getFirst_name());
		this.preparedStatement.setString(4, emp.getLast_name());
		this.preparedStatement.setString(5, emp.getGender());
		this.preparedStatement.setDate(6, new java.sql.Date(emp.getHire_date().getTime()));
		if (this.preparedStatement.executeUpdate() > 0) {
			flag = true;
		}
		this.preparedStatement.close();
		return flag;
	}


	@Override
	public List<Emp> findAll() throws Exception {
		List<Emp> list = new ArrayList<Emp>(); 
		String sql = "select * from emp";
		this.preparedStatement = this.connection.prepareStatement(sql);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(result.getInt(1));
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp findById(int emp_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> findAll(String keyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
