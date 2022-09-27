package test_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop
 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of data samples");
		double[] data;// data : ref type of var (array type of ref), as per jvm's spec : 4/8/16 mem
						// allocated on stack
		data = new double[sc.nextInt()];
		// how to find out name of the loaded class ? using inherited (from Object
		// class) method : getClass
		System.out.println("loaded class " + data.getClass());// [D
		// Can u display array contents : for-each loop
		for (double d : data) // d=data[0],d=data[1]......d=data[data.length-1]
			System.out.println(d);

		// API of java.util.Arrays class
		// public static String toString(double[] arr)

		System.out.println("Array contents : " + Arrays.toString(data));
		// populate array
//		for(int i=0;i<data.length;i++)
//		{
//			System.out.println("Enter array data");
//			data[i]=sc.nextDouble();
//		}
		//10 20 30 40
		for (double d : data) {//d=data[0]
			System.out.println("Enter array data");
			d = sc.nextDouble();
		}
	//	System.out.println(d);
		System.out.println("Array contents again  : " + Arrays.toString(data));

		sc.close();

	}

}
