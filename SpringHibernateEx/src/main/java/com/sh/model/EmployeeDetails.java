package com.sh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String sName;
	
	@Column
	private int age;
	
	@Column
	private String gender;
	
	@Column
	private String dept;

	@OneToMany(fetch = FetchType.EAGER)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
 
	@OneToMany(fetch = FetchType.EAGER)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@OneToMany(fetch = FetchType.EAGER)
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@OneToMany(fetch = FetchType.EAGER)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(fetch = FetchType.EAGER)
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

}


