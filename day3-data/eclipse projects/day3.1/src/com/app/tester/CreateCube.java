package com.app.tester;

import java.util.Scanner;
import com.app.core.Box;
/*
 * Create another class(for the purpose of separation)  : CreateBox --for  UI. --add it in "com.app.tester"
Add psvmain(..){...}
Use scanner --to accept box dims from user, create box instance.
display its details & volume.
 */

public class CreateCube {

	public static void main(String[] args) {
		int data = 100;
		System.out.println(data);
		// create scanner class instance , to wrap stdin
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of a cube");
		Box cube =new Box(sc.nextDouble());
		System.out.println(cube.getBoxDimesions());
		Box defBox=new Box();
		System.out.println(defBox.getBoxDimesions());//-100 -100 -100
		sc.close();

	}

}
