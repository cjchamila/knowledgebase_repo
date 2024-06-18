package com.chamila.kb.srp;

public class StudentFacade {
	
	private StudentRepository studentRepo;
	
	public StudentFacade(StudentRepository studentRepo) {
		this.studentRepo=studentRepo;
	}
	
	public void saveStudent(Student student) {
		studentRepo.save(student);
	}

}
