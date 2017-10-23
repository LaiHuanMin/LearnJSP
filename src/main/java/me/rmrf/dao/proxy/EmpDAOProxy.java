package me.rmrf.dao.proxy;

import java.sql.Connection;
import java.util.List;

import me.rmrf.dao.impl.EmpDAOImpl;
import me.rmrf.dao.vo.Emp;

public class EmpDAOProxy {
	private Connection connection;
	private EmpDAOImpl daoImpl;
	public EmpDAOProxy(Connection connection) {
		this.connection = connection;
		this.daoImpl = new EmpDAOImpl(connection);
		// TODO Auto-generated constructor stub
	}
	public List<Emp> findAll() throws Exception{
		return this.daoImpl.findAll();
	} 	
}
