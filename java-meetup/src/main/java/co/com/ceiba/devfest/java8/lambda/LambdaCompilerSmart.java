package co.com.ceiba.devfest.java8.lambda;

import java.util.Comparator;
import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class LambdaCompilerSmart {

	public static void main(String ... args) {
		
		threadSample();	
		sortSample();	
	}
	
	static void threadSample(){
		
		new Thread(
				() -> System.out.println(Thread.currentThread().getName())
			).start();	
	}
	
	static void sortSample(){
		
		List<Student> students = DataBase.readTxt();		
		students.sort(Comparator.comparing(Student :: getFirstName).reversed());
		System.out.println(students);
	}
}