package co.com.ceiba.devfest.java8.stream.source;

import java.util.Arrays;

public class StreamCreationArrays {

	public static void main(String ... args) {
	
		String [] data = new String[]{"Set", "List", "Collection"};
		
		Arrays.stream(data)
		.mapToInt(s -> s.length())
		.average()
		.ifPresent(System.out::println);
		
	}
}
