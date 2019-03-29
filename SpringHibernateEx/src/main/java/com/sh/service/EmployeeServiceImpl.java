package com.sh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.dao.EmployeeDaoImpl;
import com.sh.model.EmployeeDetails;
import com.sh.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoImpl dao;
	
	public int addEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		
		System.out.println("dao obj = "+dao);
		
		dao.addEmployee(employee);
		
		
		return 0;
	}

	public List<EmployeeDetails> listAllEmployees() {
		// TODO Auto-generated method stub
		
		List<EmployeeDetails> list = new ArrayList();
		
		list = dao.listAllEmployees();
		
		return list;
	}

	public int updateEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		
		dao.updateEmployee(employee);
		return 0;
	}

	public int deleteEmployee(int primary) {
		// TODO Auto-generated method stub
		
		dao.deleteEmployee(primary);
		return 0;
	}

	public EmployeeDetails getEmployeeObject(int primary) {
		// TODO Auto-generated method stub
		
		EmployeeDetails employee = dao.getEmployeeObject(primary);
		return employee;
	}

}
