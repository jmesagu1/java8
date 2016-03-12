package co.com.ceiba.devfest.java8.optional;
import java.util.Optional;

public class OptionalIfPresent {

	public static void main(String ... args) {
		beforeOptional();
		afterOptional();		
	}
	
	static void beforeOptional(){
		
		String name = getName();
		if (null != name){
			System.out.println(name);
		}
	}
	
	static void afterOptional(){
		
		Optional<String> name = getNameOpt();
		name.ifPresent(System.out::println);
		
		Optional<String> nameEmpty = getNameOptEmpty();
		nameEmpty.ifPresent(x -> System.out.println("Null?"));
	}

	static String getName(){
		return "Ceiba";
	}
	
	static Optional<String> getNameOpt(){
		return Optional.of("Dev Fest 2015");
	}
	
	static Optional<String> getNameOptEmpty(){
		return Optional.ofNullable(null);
	}
	
}
