/*
Objective :  Create a java appln to sum 2 nums , (using cmd line arguments) on the console.

*/

class Sum

{
	 public static void main(String[] ss) //cmd line args
	 {
		 int num1=Integer.parseInt(ss[0]);
		 int num2=Integer.parseInt(ss[1]);
		 System.out.println("Sum ,"+(num1+num2));
	 }
}