package me.rmrf.dao.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;

import me.rmrf.dao.dao.IEmpDAO;
import me.rmrf.dao.dbc.DatabaseConnection;
import me.rmrf.dao.factory.DatabaseFactory;
import me.rmrf.dao.impl.EmpDAOImpl;
import me.rmrf.dao.vo.Emp;

public class TestSQL {
	public static void main(String[] args) throws Exception {
		DatabaseConnection dc = DatabaseFactory.getDatabaseConnection();
		Emp emp = new Emp(1008800006,new Date(),new Date(),"lai","huanmin","M");
		EmpDAOImpl daoImpl = new EmpDAOImpl(dc.getConnection());
		System.out.println(daoImpl.doCreate(emp));;
	}
	
}
