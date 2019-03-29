package com.sh.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sh.model.EmployeeDetails;
import com.sh.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
	
	
	
	@Autowired
	EmployeeServiceImpl service;

	@RequestMapping("/RegisterEmployee")
	public String registerStudents(Model model)
	{
		model.addAttribute("employee", new EmployeeDetails());
		return "addEmployee.jsp";
	
		
	}
	
	@RequestMapping(value="/registerSuccess", method=RequestMethod.POST)
	public String registerSuccess(@ModelAttribute("employee") EmployeeDetails employee) {
		
		
		System.out.println(employee.getsName());
		System.out.println(employee.getDept());
		System.out.println("EmployeeService obj = "+service);

		service.addEmployee(employee);
		
		//userService.createUser(student);
		return "redirect:/listEmployees";
	}
	
	@RequestMapping(value="/listEmployees", method=RequestMethod.GET)
	public String listEmployees(Model model)
	{
		//ModelAndView model = new ModelAndView();
		List<EmployeeDetails> employee = new ArrayList();
		
		employee = service.listAllEmployees();
		
	//System.out.println("student in Controller = "+student);
		
		/*
		for (StudentDetails stu : student) {
			
			System.out.println(stu.getId());
			System.out.println(stu.getsName());
			System.out.println(stu.getAge());
			System.out.println(stu.getDept());
			//System.out.println(stu.getCity());
			
			
		}
		*/
		

		/*
		model.addObject("list", student);
	
		model.setViewName("listStudents.jsp");
		*/
		
		model.addAttribute("list", employee);
		
		
		return "listEmployees.jsp";
		
	}
	
	@RequestMapping(value="/updateOrDelete", method=RequestMethod.POST)
	public String updateOrDelete(HttpServletRequest req , Model model)
	{
		int primary = Integer.parseInt(req.getParameter("key"));
		
		String action =  req.getParameter("action");
		
		System.out.println("primary id = "+primary);
		
		System.out.println("Action = "+action);
		
		if(action.equals("update"))
		{
			EmployeeDetails employee = service.getEmployeeObject(primary);
			
			/*
			
			System.out.println(student.getId());
			System.out.println(student.getsName());
			System.out.println(student.getAge());
			System.out.println(student.getGender());
			System.out.println(student.getDept());
			*/
			model.addAttribute("employee", employee);
			
			return "updateEmployeeDetails.jsp";
		}
		else
		{
			service.deleteEmployee(primary);
			return "redirect:/listEmployees";
		}
		
		
		
		
	}
	
	
	@RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
   public String updateEmployee(HttpServletRequest req , @ModelAttribute("employee") EmployeeDetails employee)
   {
		int primary = Integer.parseInt(req.getParameter("id"));
		
		//System.out.println("primary id = "+primary);
		employee.setId(primary);
		/*
		System.out.println("id = "+student.getId());
		System.out.println(student.getId());
		System.out.println(student.getsName());
		System.out.println(student.getAge());
		System.out.println(student.getGender());
		System.out.println(student.getDept());
		*/
		service.updateEmployee(employee);
		
		
		return "redirect:/listEmployees";
	   
   }
	


}
