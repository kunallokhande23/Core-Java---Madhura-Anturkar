package com.app.tester;

import java.util.Scanner;

import com.app.core.Box;

public class CreateAnotherBox {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st box dims : w d h");
		Box box1=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());//10 20 30
		System.out.println("box1 "+box1);
		System.out.println("Enter offset in dims: w d h");
		/* Box newBox= */box1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());// 3 -4 5
	//	System.out.println(newBox.getBoxDimesions());//13 16 35
		sc.close();

	}

}
