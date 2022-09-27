package java8_strms;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// attach stream to the list n display the elem in seq manner
		List<Integer> ints=Arrays.asList(12,2,30,4,51,16,7,8,19,10);
		//attach a strm to the collection(list) n display
		System.out.println("List elems using seq stream");
		ints.stream() //Stream<Integer>
		.forEach(i -> System.out.println(i));
		//Can u process the elems in parallel manner ? 
		System.out.println("List elems using parallel stream");
		ints.parallelStream()  //Stream<Integer> : access parallel
		.forEach(i -> System.out.println(i));
		
		

	}

}
