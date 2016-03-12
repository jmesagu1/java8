package co.com.ceiba.devfest.java8.stream.interm;

import java.util.List;
import java.util.stream.Collectors;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class FilterExample {

	public static void main(String ... args) {
		List<Student> students = DataBase.readTxt();
		
		List<Student> prom2011 = students.stream()
				.filter(s -> s.getGradYear() == 2011)
				.collect(Collectors.toList());
		
		System.out.println(prom2011);
	}
}
