package co.com.ceiba.devfest.java8.funint;

public class Test {

	public static void main(String[] args) {
		MathOperator sum = (a, b) -> a + b;
		System.out.println(sum.operate(1, 2));
		
		MathOperator mul = (a, b) -> a * b;
		System.out.println(mul.operate(2, 3));
		
		System.out.println(mul.div(6, 3));
		
		System.out.println(MathOperator.modulo(9, 2));
	}
}