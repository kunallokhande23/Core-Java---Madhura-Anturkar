package tester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static utils.GenericUtils.printAnyList;

public class Test2 {

	public static void main(String[] args) {
		//fixed size Integer list
		List<Integer> intList=Arrays.asList(10,20,30,1,3,4,56);
		//shuffle n print the list
		//Collections class API
		//static void shuffle(List<?> list)
		System.out.println("Shuffled Integer list");
		Collections.shuffle(intList);
		printAnyList(intList);
		
		
		//fixed size Double list
		List<Double> doubles=Arrays.asList(10.0,20.3,30.7,1.7,3.0,4.3,56.67);//auto boxing
		//shuffle n print the list
		Collections.shuffle(doubles);
		System.out.println("Shuffled Double list");
		printAnyList(doubles);
			
		

	}

}
