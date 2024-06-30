package com.chamila.kb.srp.after;

import java.sql.Date;


public class SRPDemo {

	public static void main(String[] args) {
		StudentRepository studentRepo = new StudentRepositoryImpl();
		Student student = new Student(1, "Chamila", new Date(0), "Kandy, Sri Lanka");
		StudentFacade studentFacade = new StudentFacade(studentRepo);
		studentFacade.saveStudent(student);
		
	}

}
