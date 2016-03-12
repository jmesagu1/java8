package co.com.ceiba.devfest.java8.methodref;

import java.util.function.Function;

public class ConstructorRef {

	public static void main(String ... args) {
		Function<Runnable, Thread> f = Thread::new;
		Thread thread = f.apply(() -> System.out.println("Hello"));
		thread.start();
	}
}