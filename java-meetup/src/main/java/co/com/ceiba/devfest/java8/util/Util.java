package co.com.ceiba.devfest.java8.util;

public class Util {

	public static void printArray(String[] array) {
		System.out.print(array[0]);
		for (int i = 1; i < array.length; i++) {
			System.out.print(", " + array[i]);
		}
	}
}