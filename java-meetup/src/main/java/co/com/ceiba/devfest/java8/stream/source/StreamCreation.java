package co.com.ceiba.devfest.java8.stream.source;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		int gauss =  IntStream.range(1, 101)
				.sum();
		
		int gauss2 = IntStream.rangeClosed(1, 100)
				.sum();
		
		System.out.println("<Gauss 1 + 2 + ... 100> : " + gauss);
		System.out.println("<Gauss 1 + 2 + ... 100> : " + gauss2);
		
		Stream.of(1, 10 , 3, 5)
		.sorted()
		.forEach(System.out::println);
		
	}
}