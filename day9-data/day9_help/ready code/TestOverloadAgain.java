/* Solve after autoboxing & var-args*/
package tester;
public class TestOverloadAgain 
{
	public static void main(String[] args) 
	{
		test(123);
	}
	
	
	static void test(Integer o)
	{
		System.out.println("in Integer version");
	}
	static void test(double o)
	{
		System.out.println("in double version");
	}
	static void test(int... o)
	{
		System.out.println("in int... version");
	}
}
