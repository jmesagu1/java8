package co.com.ceiba.devfest.java8.methodref;

import static co.com.ceiba.devfest.java8.util.Util.printArray;

import java.util.Arrays;

public class MethodRefExisting {

	public static void main(String ... args) {
		ComparadorLength compa = new ComparadorLength();
		String[] colors = { "Black", "White", "Red", 
							"Green", "Orange", "Blue", 
							"Yellow", "Purple", "Brown" };

		//Arrays.sort(colors, (s1, s2) -> compa.menosLetrasPrimero(s1, s2));
		Arrays.sort(colors, compa::menosLetrasPrimero);
		//Arrays.sort(stringArray, compa::masLetrasPrimero);
		printArray(colors);
	}

	static class ComparadorLength {
	    public int menosLetrasPrimero(String s1, String s2) {
	        return s1.length() - s2.length();
	    }
	        
	    public int masLetrasPrimero(String s1, String s2) {
	    	return s2.length() - s1.length();
	    }
	}
}