package co.com.ceiba.devfest.java8.funpkg;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		/* UnaryOperator<String> upper = new UnaryOperator<String>() {
			
			@Override
			public String apply(String string) {
				return string.toUpperCase();
			}
		}; */
		
		UnaryOperator<String> upper = s -> s.toUpperCase();
		System.out.println(upper.apply("ceiba devfest"));
	}
}