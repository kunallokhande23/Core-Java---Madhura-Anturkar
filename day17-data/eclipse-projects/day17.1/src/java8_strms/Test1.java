package java8_strms;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] data= {1,23,24,10,11,56,78,-80,-10};
		//Can you add this data in the IntStream n display the same using higher order func/method : forEach
		//API : java.util.Arrays --- public static IntStream stream(int[] data)
		Arrays.stream(data) //IntStream : src 
		.forEach(i -> System.out.print(i+" "));//terminal op.
		

	}

}
