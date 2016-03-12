package co.com.ceiba.devfest.java8.funpkg;

import java.util.function.DoublePredicate;

public class PredicateExample {

	public static void main(String[] args) {
		/* Predicate<Double> ganaExamen = new Predicate<Double>() {
			
			@Override
			public boolean test(Double t) {
				return t >= 3.0;
			}
		}; */
		
		/* DoublePredicate ganaExamen = new DoublePredicate() {
			
			@Override
			public boolean test(double value) {
				return value >= 3-0;
			}
		}; */

		DoublePredicate ganaExamen = d -> d >= 3.0;
		System.out.println(ganaExamen.test(2.4));
		System.out.println(ganaExamen.test(3.8));
	}
}