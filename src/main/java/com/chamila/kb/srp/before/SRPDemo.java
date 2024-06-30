package com.chamila.kb.srp.before;

import java.sql.Date;


public class SRPDemo {

	public static void main(String[] args) {
		Student student = new Student(1, "Chamila", new Date(0), "Kandy, Sri Lanka");
		student.save(student);
		
	}

}
