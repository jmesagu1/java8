package co.com.ceiba.devfest.java8.optional;

import co.com.ceiba.devfest.java8.model.City;
import co.com.ceiba.devfest.java8.model.Country;
import co.com.ceiba.devfest.java8.model.School;
import co.com.ceiba.devfest.java8.model.Student;

public class BasicAvoidingNull {

	public static void main(String ...args) {
		
		Country country = getCountry();
		String name = country.getCity().getSchool().getStudent().getFirstName(); // NullPointer?
		
		name = "UNKNOWN";
		
		if (null != country){
			if (null != country.getCity()){
				if (null != country.getCity().getSchool()){
					if (null != country.getCity().getSchool().getStudent()){
						name = country.getCity().getSchool().getStudent().getFirstName();
					}
				}
			}
		}
		
	}
	
	static Country getCountry(){
		Country country = new Country();
		City city = new City();
		School school = new School();
		Student student = new Student();
		student.setFirstName("Jorge");		
		country.setCity(city);
		city.setSchool(school);
		school.setStudent(student);		
		
		return country;
	}

}
