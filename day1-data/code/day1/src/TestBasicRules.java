/*
Objective :  Create a java appln to sum 2 nums , (using cmd line arguments) on the console.

*/
import java.util.Scanner;
class TestBasicRules
{
 private double data;//instance var : mem allocated after creating instance of the class. (constructor) : inited to the def. values
 private static int counter;//static data member , mem allocated @ class loading time : method area (meta space) , inited with def value


	 public static void main(String[] ss) //cmd line args
	 {
		 int num1=100;	//num1 : 	primitive , holding the value , method local var. ---stack , always un-inited by def. , 4 bytes 
		 System.out.println("num1="+num1);//javac err (till u init it!)
		 System.out.println("counter="+counter);//no javac err
		 TestBasicRules t1=new TestBasicRules();//no javac err : since javac impl. supplies a def arg-less ctor
		 	 System.out.println("data="+t1.data);//no javac err
			  TestBasicRules t2=new TestBasicRules();//no javac err : since javac impl. supplies a def arg-less ctor
		 	 System.out.println("data="+t2.data);//no javac err
		String name=new String("Meera");
		name++;
		Scanner sc=new Scanner(System.in);
		sc *= 10;
		sc.close();

	 }
}