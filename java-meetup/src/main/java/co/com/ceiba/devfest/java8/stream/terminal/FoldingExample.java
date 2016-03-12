package co.com.ceiba.devfest.java8.stream.terminal;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class FoldingExample {

	public static void main(String ... args) {
		List<Student> students = DataBase.readTxt();

		double sumScore = students.stream()
				.filter(s -> s.getGradYear() == 2012)
				.mapToDouble(s -> s.getScore())
				.reduce(0.0, (d1, d2) -> d1 + d2);
		
		System.out.println("2012 Total score: " + sumScore);
	}
}
