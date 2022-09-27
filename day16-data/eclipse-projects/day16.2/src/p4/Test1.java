package p4;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,3,4,5,6,11,20,10);
		//Is List Iterable ? YES 
		//Has it inherited def method forEach ? YES
		//API : public default void forEach(Consumer<? super T> action)
		//display elems of the list --using forEach --using ano inner class
//		list.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}
//			
//		});
		//Java 8 onwards , can u directly pass the behavior to the method ? YES
		System.out.println("List contents");
		list.forEach(i -> System.out.println(i));
		//Can u say forEach : is a higher order function/method : YES
		TreeSet<Integer> ts=new TreeSet<>(list);
		//Can u use forEach to display TS's contents ? YES
		System.out.println("TS contents ");
		ts.forEach(i -> System.out.println(i));//sorted nos
		
		

	}

}
