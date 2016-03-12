package co.com.ceiba.devfest.java8.lambda;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class LambdaSearchStudent {

	public static void main(String ... args) {
		
		List<Student> students = DataBase.readTxt();
		
		students.parallelStream()
			.filter(s -> s.getGradYear() == 2011)
			.mapToDouble(Student::getScore)
			.max()
			.ifPresent(System.out::println);
	}
}