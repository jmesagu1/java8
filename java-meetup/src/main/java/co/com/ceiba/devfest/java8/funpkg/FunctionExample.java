package co.com.ceiba.devfest.java8.funpkg;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		/* Function<String, Integer> countWords = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String text) {
				return text.split(" ").length;
			}
		}; */
		
		Function<String, Integer> countWords = s -> s.split(" ").length;
		String text = "We are enjoying at Ceiba's meetup";
		System.out.println(countWords.apply(text));
	}
}