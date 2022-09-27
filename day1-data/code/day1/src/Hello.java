/*
Objective :  Create a java appln to display welcome message , with user name (using cmd line arguments) on the console.

*/
//what is the name of def. package  if u dont add any package statement ? Anonymus
//which pkg is available by def to all java classes ? java.lang
class Hello

{
	 public static void main(String[] ss) //cmd line args
	 {
		 System.out.println("Hello ,"+ss[0]);
		 System.out.println("Welcome !");
	 }
}