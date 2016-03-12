package co.com.ceiba.devfest.java8.methodref;

import static co.com.ceiba.devfest.java8.util.Util.printArray;

import java.util.Arrays;

public class MethodRefArbitrary {

	public static void main(String ... args) {
		String[] colors = { "Black", "White", "Red", 
							"Green", "Orange", "Blue", 
							"Yellow", "Purple", "Brown" };
		//Arrays.sort(colors, (s1, s2) -> s1.compareToIgnoreCase(s2));
		Arrays.sort(colors, String::compareToIgnoreCase);
		printArray(colors);
	}
}