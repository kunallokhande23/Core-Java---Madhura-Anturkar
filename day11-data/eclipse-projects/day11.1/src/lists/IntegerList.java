package lists;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerList {

	public static void main(String[] args) {
		// create int[] 
		int[] data= {10,20,1,3,23,45,10};
		//create Empty AL with def capa
		ArrayList<Integer> list=new ArrayList<>();
		for(int i : data)//i=data[0].....i=data[data.length-1] : no conversion
			list.add(i); //any impl conversion : auto boxing
		System.out.println("list contents via toString "+list);
		list.add(0,99);
		System.out.println("list after insert "+list);//99,10,20,1,3,23,45,10
		ArrayList<Integer> list2=new ArrayList<>();
		list2.addAll(list);
		System.out.println("list 2 "+list2);//99,10,20,1,3,23,45,10 : copy of refs
		System.out.println(list.get(list.size()-1));//10 : O(1)
		System.out.println(list.indexOf(10)+" "+list.lastIndexOf(10));//0 7
		System.out.println("removed elem "+list2.remove(3));
		System.out.println(list2);//99,10,20,3,23,45,10
		System.out.println(list);//99,10,20,1,3,23,45,10
		System.out.println("replaced "+list.set(2, 1111));//20 : O(1) 
		System.out.println(list);//99,10,1111,1,3,23,45,10
		Collections.sort(list);
		System.out.println(list);//sorted list : asc order
		System.out.println(list2);//99,10,20,3,23,45,10
		
		
		
		

	}

}
