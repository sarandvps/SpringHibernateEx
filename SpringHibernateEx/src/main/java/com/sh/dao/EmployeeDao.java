package com.sh.dao;

import java.util.List;

import com.sh.model.EmployeeDetails;

public interface EmployeeDao {
	
	public int addEmployee(EmployeeDetails student);

	public List<EmployeeDetails> listAllEmployees();
	
	public int updateEmployee(EmployeeDetails student);
	
	public int deleteEmployee(int primary);
	
	public EmployeeDetails getEmployeeObject(int primary);
}
