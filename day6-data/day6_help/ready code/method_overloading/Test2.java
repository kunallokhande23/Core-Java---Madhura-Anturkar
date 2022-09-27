package method_overloading;

public class Test2 {

	public static void main(String[] args) {
		test(2.3,1);
		test(1,3.4);
		test(2,3);

	}
	static void test(int a,double b)
	{
		System.out.println(1);
	}
	static void test(double a ,int b)
	{
		System.out.println(2);
	}

}
