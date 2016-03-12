package co.com.ceiba.devfest.java8.funint;

//@FunctionalInterface
public interface MathOperator {

	int operate(int a, int b);
	
	default int div(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("you shall not divide by 0!");
		}
		return a / b;
	}
	
	static int modulo(int a, int b) {
		return a % b;
	}
}