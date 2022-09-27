package com.iacsd.tester;
import java.util.Scanner;
import com.iacsd.core.Emp;
class TestEmp
{
	 public static void main(String[] args)
	 {
		 //create scanner instance , wrapping stdin
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Emp Details : id name salary ");
		 Emp e1=new Emp(sc.nextInt(),sc.next(),sc.nextDouble());
		 //display emp's details
		 System.out.println(e1.getEmpDetails());
		 sc.close();
	 }
}