package method_overloading;
class Test3 
{
	public static void main(String[] args) 
	{
		test(null);
	}
	static void test(Object o)
	{
		System.out.println("in obj version");
	}
	static void test(String o)
	{
		System.out.println("in string version");
	}
//	static void test(Scanner o)
//	{
//		System.out.println("in scanner version");
//	}
}
