package co.com.ceiba.devfest.java8.funpkg;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		/* BinaryOperator<String> fullNameOp = new BinaryOperator<String>() {
			
			@Override
			public String apply(String firstName, String surname) {
				return firstName + " " +  surname;
			}
		}; */
		
		BinaryOperator<String> fullNameOp = (f, s) -> f + " " +  s;
		System.out.println(fullNameOp.apply("Simon", "Bolivar"));
	}
}