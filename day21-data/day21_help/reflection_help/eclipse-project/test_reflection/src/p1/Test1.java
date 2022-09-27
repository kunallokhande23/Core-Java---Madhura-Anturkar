package p1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// different ways of accessing the loaded class info.
			// using class literal(static data member of Class)
			System.out.println("Enter the name of the class");
			//#1
			Class<?> cls = Class.forName(sc.next());
			System.out.println(cls.getName());
			System.out.println(cls.isInterface()?"Interface":"Not I/f");
			LocalDateTime dateTime=LocalDateTime.now();
			//#2 Object.getClass() 
			Class<?> cls2=dateTime.getClass();
			System.out.println(cls2.getName());//fully qualified cls name of the loaded cls for this obj
			System.out.println(dateTime);//toString
			//#3 : using class literal : static member of the class
			Class<String> clsString=String.class;
			System.out.println(clsString.getName());
			int[][] data= {{1,2},{3,4,5,6,7}};
			System.out.println(data.getClass().getName());//[[I
			//for primitive type 
			Class<?> doubleCls=double.class;
			System.out.println(doubleCls.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
