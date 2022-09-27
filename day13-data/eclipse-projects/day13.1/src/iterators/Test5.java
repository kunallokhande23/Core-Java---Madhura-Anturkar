package iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test5 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int[] nums= {1,20,23,10,34,20,345};
		for(int i : nums)
			list.add(i);
		//display elements in the list in reverse order.
		ListIterator<Integer> litr=list.listIterator(list.size());
		System.out.println("Printing elems in reverse order");
		while(litr.hasPrevious())
			System.out.println(litr.previous());

	}

}
