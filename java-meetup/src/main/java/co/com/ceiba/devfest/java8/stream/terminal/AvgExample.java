package co.com.ceiba.devfest.java8.stream.terminal;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class AvgExample {

	public static void main(String ... args) {
		List<Student> students = DataBase.readTxt();

		double avgScore = students.stream()
				.filter(s -> s.getGradYear() == 2012)
				.mapToDouble(s -> s.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("2012 Average score: " + avgScore);
	}
}
