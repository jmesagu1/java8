package co.com.ceiba.devfest.java8.lambda;

import java.util.List;

import co.com.ceiba.devfest.java8.model.Student;
import co.com.ceiba.devfest.java8.util.DataBase;

public class BasicSearchStudent {

	public static void main(String ... args)  {

		List<Student> students = DataBase.readTxt();		
		double highestScore = 0;
		
		for (Student student : students){
			if (2011 == student.getGradYear()){
				if (highestScore < student.getScore()){
					highestScore = student.getScore();
				}
			}
		}
		
		System.out.println(highestScore);
	}
}