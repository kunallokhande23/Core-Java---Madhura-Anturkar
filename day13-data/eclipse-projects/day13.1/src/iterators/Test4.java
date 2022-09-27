package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int[] nums= {1,20,23,10,34,20,345};
		for(int i : nums)
			list.add(i);
		System.out.println(list);
		Iterator<Integer> itr=list.iterator();//attaching Itr
//		list.add(100);//appends the elem : structural modi.(i.e changing size of the list)
	//	list.remove(0);
		list.set(0,9999);//replace
		System.out.println("Printing list using Itr");
		while(itr.hasNext())
			System.out.print(itr.next()+" ");

	}

}
