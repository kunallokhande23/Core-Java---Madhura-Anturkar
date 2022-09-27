package nested;

public class TryNested {

	/**
	 * @param args
	 */
	static int counter=10;
	
	static {
		System.out.println("outer static"+counter);
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println("in main");
	//	Class.forName("nested.TryNested$StaticNested");
		//System.out.println(StaticNested.i );
	/*	StaticNested s1=new StaticNested();
		System.out.println(s1.j);
		new StaticNested().test();*/
		System.out.println(A.data);

	}
	static class StaticNested
	{
		static {
			System.out.println("inner static");
		}
		private static int i=10;
		private int j=20; 
		void test()
		{
			System.out.println(getClass().getName());
		}
	}

}
class A
{
	static {
		System.out.println("A's static");
	}
	static int data=100;
}
