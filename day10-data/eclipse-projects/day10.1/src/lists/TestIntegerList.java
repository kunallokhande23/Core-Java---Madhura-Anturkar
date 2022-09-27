package lists;

import java.util.ArrayList;

public class TestIntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list.size());//0 , init capa =10
		int[] data= {10,1,20,-20,10,45,10,56,560,33,67,70,12};
		for(int i : data)
			list.add(i);//javac : int --> Integer
		System.out.println("list : "+list);//sorted or ordered 
	//	list.add("12345");
	//	list.add(345.67);
		
		

	}

}
