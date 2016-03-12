package co.com.ceiba.devfest.java8.methodref;

import java.util.Arrays;
import java.util.List;

public class MethodRefStatic {

	public static void main(String ... args) {
		String[] colors = { "Black", "White", "Red", 
							"Green", "Orange", "Blue", 
							"Yellow", "Purple", "Brown" };
		List<String> list = Arrays.asList(colors);
		list.forEach(s -> System.out.println(s));
		list.forEach(System.out::println);
	}
}