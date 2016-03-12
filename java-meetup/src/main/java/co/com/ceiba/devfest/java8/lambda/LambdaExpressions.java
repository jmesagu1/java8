package co.com.ceiba.devfest.java8.lambda;

import java.util.function.Function;

public class LambdaExpressions {

	public static void main(String ... args) {
		
		applyFunc(new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer x) {
				return x + 1;
			}
		});
		
		applyFunc ( 
					(Integer x) -> {
						return x + 1;
					}
			);
		
		applyFunc( 
					(x) -> x + 1 
			);
		
		applyFunc ( 
					x ->  x + 1
				);
		
	}

	public static void applyFunc(Function<Integer, Integer> func){
		
		System.out.println( "Apply func(3) = " + func.apply(3));
	}
}
