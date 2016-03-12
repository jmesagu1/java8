package co.com.ceiba.devfest.java8.model;

import java.util.Optional;

public class School {

	private Student student;

	public Student getStudent() {
		return student;
	}
	
	public Optional<Student> getStudentOp() {
		return Optional.ofNullable(student);
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}