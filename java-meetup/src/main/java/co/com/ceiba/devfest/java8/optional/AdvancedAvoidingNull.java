package co.com.ceiba.devfest.java8.optional;

import java.util.Optional;

import co.com.ceiba.devfest.java8.model.City;
import co.com.ceiba.devfest.java8.model.Country;
import co.com.ceiba.devfest.java8.model.School;
import co.com.ceiba.devfest.java8.model.Student;

public class AdvancedAvoidingNull {

	public static void main(String[] args) {
	
		String name =  Optional.ofNullable(getCountry())
		.flatMap(Country :: getCityOp)
		.flatMap(City :: getSchoolOp)
		.flatMap(School :: getStudentOp)
		.map(Student :: getFirstName)
		.orElse("UKNOWN");
		
		System.out.println(name);
	}
	
	
	static Country getCountry(){
		Country country = new Country();
		City city = new City();
		School school = new School();
		Student student = new Student();
		student.setFirstName("Jorge");		
		//country.setCity(city);
		city.setSchool(school);
		school.setStudent(student);		
		
		return country;
	}

}
