package com.chamila.kb.srp.before;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student {

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
	
	/* SINGLE RESPONSIBILITY PRINCIPLE CONCEPTS: 
	 * STUDENT SHOULD HAVE ONLY ONE REASON TO CHANGE : ONLY IF STUDENT RELATED DATA CHANGES OR UPDATES.
	 * SHOULD BE HIGHLY COHESIVE : ONLY STUDENT RELATED DATA SHOULD BE HERE
	 * 
	 * THIS CODE VIOLATES THE SINGLE RESPONSIBILITY PRINCIPLE : 
	 * STUDENT CLASS HAS UNNECESSARY RESPONSIBILITY OF SAVING AND 
	 * IT IS 'TIGHTLY COUPLED' WITH JDBC RELATED LOGIC AND THEREBY HAS 'LOW COHESION'
	 */
	public void save(Student student) {
		Connection conn=null;
		PreparedStatement prepStmt=null;
		String insertSQL = "INSERT INTO student (id,name,dob,address) VALUES (?, ?, ?, ?)";
		try {
			 conn=DriverManager.getConnection("db_url","db_user","db_password");
			 prepStmt = conn.prepareStatement(insertSQL);
			 prepStmt.setInt(1, student.getId());
		     prepStmt.setString(2, student.getName());
		     prepStmt.setDate(3, student.getDob());
		     prepStmt.setString(4, student.getAddress());
			 prepStmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
