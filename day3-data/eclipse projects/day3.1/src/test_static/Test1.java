package test_static;

//ALL static members of the System class
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
//static import syntax
//can access DIRECTLY (w/o using class name)
import static java.lang.System.out;

public class Test1 {
	private int i;
	private static int j;

	public static void main(String[] args) {
		// System.out.println(this);
		// System.out.println(super);
		show();
		Test1 t1 = new Test1();
		t1.test();
		System.out.println(sqrt(25));
		System.out.println(PI);

	}

	// add a static method
	private static void show() {
		out.println("in show " + j);
	}

	// add a non static method
	private void test() {
		out.println("in test " + i + " " + j);
		show();
	}

}
