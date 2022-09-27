package java8_strms;

import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {
		// Create IntStream , 5-50 : range  n display it
		// Create IntStream , 5-50 : rangeClosed  n display it
		// Create IntStream , 10,23,1,3,4,5,7: of n display it
		IntStream.range(5, 51).forEach(i -> System.out.print(i+" "));
		System.out.println();
		IntStream.rangeClosed(5, 50).forEach(i -> System.out.print(i+" "));
		System.out.println();
		IntStream.of(10,23,1,3,4,5,7).forEach(i -> System.out.print(i+" "));
		
		

	}

}
