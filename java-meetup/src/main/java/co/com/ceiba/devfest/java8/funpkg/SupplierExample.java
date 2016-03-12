package co.com.ceiba.devfest.java8.funpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		/* Supplier<List<String>> factory = new Supplier<List<String>>() {
			
			@Override
			public List<String> get() {
				return new ArrayList<>();
			}
		}; */

		Supplier<List<String>> factory = () -> new ArrayList<>();
		List<String> list = factory.get();
		System.out.println("New list with size " + list.size());
	}
}