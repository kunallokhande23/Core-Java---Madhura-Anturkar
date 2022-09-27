package com.app.tester;

import java.util.Scanner;

import com.app.core.Box;

public class TestBoxEquality {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st box dims : w d h");
		Box box1=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("box1 "+box1);
		System.out.println("Enter 2nd box dims : w d h");
		Box box2=new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("box2 "+box2);
		System.out.println(box1.isEqual(box2)?"Same":"Different");
		sc.close();

	}

}
