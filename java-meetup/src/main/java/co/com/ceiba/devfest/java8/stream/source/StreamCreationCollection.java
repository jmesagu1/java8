package co.com.ceiba.devfest.java8.stream.source;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class StreamCreationCollection {

	public static void main(String[] args) {
		
		List<Student> students = DataBase.readTxt();
		
		students.stream()
			.mapToDouble(s -> s.getScore())
			.max()
			.ifPresent(System.out::println);
		
		students.parallelStream()
				.mapToDouble(s -> s.getScore())
				.min()
				.ifPresent(System.out::println);
	}
}