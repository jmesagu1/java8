package co.com.ceiba.devfest.java8.funpkg;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		/* Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("Consuming '" + s + "'");
			}
		}; */
		
		Consumer<String> c = s -> System.out.println("Consuming '" + s + "'");
		c.accept("Ceiba Meetup");

		c.andThen(s -> System.out.println("Done with '" + s + "'!"))
		 .accept("Java8");
	}
}