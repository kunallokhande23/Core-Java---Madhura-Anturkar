package tester;

import java.util.Arrays;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		// 10, 20, 30 1,23,34,11,10,12 --- add it in a fixed size list
		//java.util.Arrays : API
		//public static <T> List<T> asList(T ... t)
		List<Integer> intList=Arrays.asList(10, 20, 30 ,1,23,34,11,10,12);
		System.out.println(intList);
		//intList.add(12345);
		//intList.remove(0);
		intList.set(0, 34567);
		System.out.println(intList);
		//convert this List ---> array
		//Hint API : Collection i/f method
		//<T> T[] toArray(T[] emptyArray)
//		Integer[] arr=new Integer[intList.size()];//null......null : 9
//		System.out.println("Before "+Arrays.toString(arr));
//		arr=intList.toArray(arr);
//		System.out.println("After "+Arrays.toString(arr));
		
		
		Integer[] arr=intList.toArray(new Integer[intList.size()]);
		System.out.println("After "+Arrays.toString(arr));
		
		
	}

}
