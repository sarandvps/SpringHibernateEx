package com.sh.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sh.dao.EmployeeDao;
import com.sh.model.EmployeeDetails;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	@Autowired
    SessionFactory sessionFactory;
	
	//Session se = null;
	
	public int addEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		
		System.out.println("sessionFactory obj = "+sessionFactory);
		Session session = null;
		session = sessionFactory.openSession();
		
		
		Transaction trnx = session.beginTransaction();
		
		session.save(employee);
		
		trnx.commit();
		
		session.close();
		
		return 0;
	}
	public List<EmployeeDetails> listAllEmployees() {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = sessionFactory.openSession();
		
		
		List<EmployeeDetails> list = new ArrayList();
		
		Query query = session.createQuery("from EmployeeDetails");
		
		list = query.list();
		
		session.flush();
		session.close();
		
		
		
		
		
		return list;
	}
	public int updateEmployee(EmployeeDetails employee) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = sessionFactory.openSession();
		
		Transaction trnx = session.beginTransaction();
		
		session.update(employee);
		
		trnx.commit();
		
		session.flush();
		session.close();
	
		
		
		
		return 0;
	}
	public int deleteEmployee(int primary) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = sessionFactory.openSession();

		Transaction trnx = session.beginTransaction();
		
		EmployeeDetails employee =   (EmployeeDetails) session.load(EmployeeDetails.class, primary);
		
		session.delete(employee);
		
		trnx.commit();
		
		session.flush();
		session.close();
		return 0;
	}
	public EmployeeDetails getEmployeeObject(int primary) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = sessionFactory.openSession();
		
		EmployeeDetails employee = (EmployeeDetails) session.load(EmployeeDetails.class, primary);
		session.flush();
		//session.close();
		return employee;
	}

}

