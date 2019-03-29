package com.sh.service;

import java.util.List;

import com.sh.model.EmployeeDetails;

public interface EmployeeService {
	
	public int addEmployee(EmployeeDetails student);
	
	public List<EmployeeDetails> listAllEmployees();
	
	public int updateEmployee(EmployeeDetails student);
	
	public int deleteEmployee(int primary);
	
	public EmployeeDetails getEmployeeObject(int primary);

}


