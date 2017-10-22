package me.rmrf.dao.dao;

import java.util.List;

import me.rmrf.dao.vo.Emp;

public interface IEmpDAO {
	/**
	 * 创建Employees
	 * @return
	 * @throws Exception
	 */
	public boolean doCreate(Emp emp) throws Exception;

	/**
	 * 根据关键字搜索
	 * @param keyWord
	 * @return
	 * @throws Exception
	 */
	public List<Emp> findAll(String keyWord) throws Exception;

	/**
	 * 根据id来查询
	 * @param emp_no
	 * @return
	 * @throws Exception
	 */
	public Emp findById(int emp_no) throws Exception;
}
