package co.com.ceiba.devfest.java8.model;

import java.util.Optional;

public class City {

	private School school;

	public School getSchool() {
		return school;
	}
	
	public Optional<School> getSchoolOp() {
		return Optional.ofNullable(school);
	}

	public void setSchool(School school) {
		this.school = school;
	}
}