package co.com.ceiba.devfest.java8.stream.source;

import java.util.Locale;
import java.util.Random;

public class StreamCreationRandom {

	public static void main(String ... args) {
		Random random = new Random();		
		boolean greater =  random.ints() //Infinite
		.anyMatch(s -> {
			
			System.out.printf(Locale.forLanguageTag("es-CO"),"%,d\n",s);
			
			return s > 1_000_000_000;
		});
		
		System.out.println("greater than 1.000'000.000: " + greater);
	}
}