package co.com.ceiba.devfest.java8.model;

import java.util.List;

public class Student {

	private int gradYear;
	private double score;
	private String firstName;
	private String surname;
	private int id;
	private List<String> courses;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGradYear() {
		return gradYear;
	}
	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<String> getCourses() { return courses; }
	public void setCourses(List<String> courses) { this.courses = courses; }

	public String getFullName(){
		return firstName +  " " + surname;
	}

	@Override
	public String toString() {
		return "Student [gradYear=" + gradYear + ", score=" + score + ", firstName=" + firstName + ", surname="
				+ surname + ", id=" + id + "] \n";
	}	
}