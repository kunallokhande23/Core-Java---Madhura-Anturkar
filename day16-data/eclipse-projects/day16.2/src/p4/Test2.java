package p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(Arrays.asList(10,21,3,4,5,6,11,20,17));
		System.out.println("Orig list ");
		list.forEach(i -> System.out.println(i));
		//remove all odd elements form the list n display the same
		//Collection i/f method : public default boolean removeIf(Predicate<? super T> filter)
		//java.util.function.Predicate : Is it a func i/f ? YES
		//SAM : public boolean test(T t)
		boolean removed= list.removeIf(i -> i % 2 != 0 );
		System.out.println(removed);//t
		System.out.println("List after remove ");
		list.forEach(i -> System.out.println(i));
	}

}
