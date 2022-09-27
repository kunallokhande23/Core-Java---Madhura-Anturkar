package com.app.tester;

import java.util.Scanner;
import com.app.core.Box;
/*
 * Create another class(for the purpose of separation)  : CreateBox --for  UI. --add it in "com.app.tester"
Add psvmain(..){...}
Use scanner --to accept box dims from user, create box instance.
display its details & volume.
 */

public class CreateBox {

	public static void main(String[] args) {
		int data=100;System.out.println(data);
		//create scanner class instance , to wrap stdin
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter box dims : w d h");
		Box b1;//b1 : ref type of var : class type of ref (i.e b1 can ONLY refer to Box class instance)
		//no obj of type Box is created yet., as per JVM's spec 4/8/16 .... bytes will be mem allocated in : stack
		//why on stack : b1 : method local var
	//	System.out.println(b1);
		b1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());//Box class gets loaded in method area
		//, instance is created in the heap
		System.out.println(b1);//F.Q className@134567
		//display dims n volume 
		System.out.println(b1.getBoxDimesions());
		System.out.println("Vol of the Box "+b1.getBoxVolume());		
		sc.close();

	}

}
