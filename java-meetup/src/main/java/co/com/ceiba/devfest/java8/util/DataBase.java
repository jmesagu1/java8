package co.com.ceiba.devfest.java8.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import co.com.ceiba.devfest.java8.model.Student;

public class DataBase {

	public static List<Student> readTxt(){

		List<List<String>> courses = readCourses();
		try (Stream<String> lines = Files.lines(Paths.get("src/main/resources/MOCK_DATA.txt"))){

			List<Student> students = 	lines
			.parallel()
			.map(s -> {
					String [] arra = s.split(";");
					Student student = new Student();
					student.setFirstName(arra[2]);
					student.setSurname(arra[3]);
					student.setGradYear(Integer.parseInt(arra[0]));					
					student.setScore(Double.parseDouble(arra[1]));	
					student.setId(Integer.parseInt(arra[4]));					
					return student;
			})					
			.collect(Collectors.toList());

			IntStream.range(0, 1000)
					.forEach(i -> students.get(i).setCourses(courses.get(i)));
			return students;
			
		} catch (IOException  e) {
			e.printStackTrace();
			return new ArrayList<>();
		}		

	}
	
	public static List<Student> readJSON(){
		
		List<Student> students = new ArrayList<>();
		
		try (Stream<String> lines = Files.lines(Paths.get("MOCK_DATA.json"))){
			
			Optional<String> json = lines.reduce((a,b) -> a + b);
			 lines.close(); 			
			 ScriptEngine se = new ScriptEngineManager().getEngineByExtension("js");
			 
			 se.eval("var obj = " + json.get() + ";");		 
			 Student student = null;
			 for (int i = 0; i < 1000; i++){
				 student = new Student();
				 student.setGradYear(Integer.parseInt(se.eval("obj["+ i +"].gradYear").toString()));		 
				 students.add(student);
			 }
			 
		}catch (IOException | ScriptException e) {
			e.printStackTrace();
		}
		
		return students;
	}

	private static List<List<String>> readCourses() {
		List<List<String>> courses = new ArrayList<>();

		try (Stream<String> lines = Files.lines(Paths.get("src/main/resources/COURSES.txt"))){

			courses = 	lines
					.parallel()
					.map(s -> Arrays.asList(s.split(",")))
					.collect(Collectors.toList());

		} catch (IOException  e) {
			e.printStackTrace();
		}
		return courses;
	}
}