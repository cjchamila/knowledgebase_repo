package com.chamila.kb.srp.after;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentRepositoryImpl implements StudentRepository{

	@Override
	public void save(Student student) {
				
		String insertSQL = "INSERT INTO student (id,name,dob,address) VALUES (?, ?, ?, ?)";
		
		try(Connection conn=DriverManager.getConnection("db_url","db_user","db_password");
				PreparedStatement prepStmt = conn.prepareStatement(insertSQL);) {
			
		    prepStmt.setInt(1, student.getId());
		    prepStmt.setString(2, student.getName());
		    prepStmt.setDate(3, student.getDob());
		    prepStmt.setString(4, student.getAddress());
		    
		    prepStmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
