package test_arrays;

import java.util.Arrays;
import java.util.Scanner;

import com.app.core.Box;

/*
 * Add Box class into "com.app.core"
Create a tester class  : TestBoxArray in package  "test_arrays"

Objective : Ask user(client) , how many boxes to make ?
Create suitable array to hold Box type refs.

Accept Box dims 

Store these details suitably.
1. Display using single for-each loop, box dims n volume
 */
public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes to make");//10
		Box[] boxes;//how many objs are created in heap ? 0 , stack : boxes : ref type var : array type of ref var
		//boxes can only refer to an array obj : holding Box type of refs.
		boxes=new Box[sc.nextInt()];//how many objs are created in heap ? 1 : array object : holder
		System.out.println(Arrays.toString(boxes));//[null,null.....,null]
		System.out.println("cls loaded "+boxes.getClass());//[Lcom.app.core.Box
		for(int i =0;i<boxes.length;i++)
		{
			System.out.println("Enter box dims : w d h");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//Box class loaded , 
			//instance created in the heap (outside array) , ref is reted to the caller
		}
		//display dims n vol of all created boxes : for-each
		for(Box b : boxes)//b=boxes[0],b=boxes[1]......b=boxes[boxes.length-1]
		{
			System.out.println(b.getBoxDimesions());
			System.out.println("vol="+b.getBoxVolume());
		}
		//what will be o/p ?
		System.out.println(Arrays.toString(boxes));//F.Q className@hashCode.......
		
		sc.close();

	}

}
