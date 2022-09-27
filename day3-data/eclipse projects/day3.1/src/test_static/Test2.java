package test_static;

public class Test2 {
	private static int a=10;
	private int b=20;
	static {
		System.out.println("in 1st static init block");
		System.out.println("a="+a);
		a++;
	}
	static {
		System.out.println("in another SIB "+a);
	}
	//non static init block
	{
		System.out.println("from non static init block");
		System.out.println("a="+a+" b="+b);
	}
	

	public Test2(int b) {
		super();
		System.out.println("in ctor");
		this.b = b;
	}


	public static void main(String[] args) {
		System.out.println("in main");
		Test2 ref1=new Test2(23);
		Test2 ref2=new Test2(24);
		System.out.println("main over....");
		

	}

}
