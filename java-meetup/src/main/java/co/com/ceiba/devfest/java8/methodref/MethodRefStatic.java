package co.com.ceiba.devfest.java8.methodref;

import java.util.Arrays;
import java.util.List;

public class MethodRefStatic {

	public static void main(String ... args) {
		String[] colors = { "Black", "White", "Red", 
							"Green", "Orange", "Blue", 
							"Yellow", "Purple", "Brown" };
		List<String> list = Arrays.asList(colors);
		// Simple lambda expression without method-ref
		list.forEach(s -> MethodRefStatic.print(s));
		// Method-reference in action
		list.forEach(MethodRefStatic::print);
	}

	public static void print(String s) {
		System.out.println(s);
	}
}