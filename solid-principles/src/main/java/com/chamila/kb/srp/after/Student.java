package com.chamila.kb.srp.after;

import java.io.Serializable;
import java.sql.Date;


/*SINGLE RESPONSIBILITY PRINCIPLE : 
Every software component should have one and only one responsibility*/

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Date dob;
	private String address;	
	
	public Student(int id, String name, Date dob, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id ,"+"name ,"+"dob ,"+"address";
	}

}
