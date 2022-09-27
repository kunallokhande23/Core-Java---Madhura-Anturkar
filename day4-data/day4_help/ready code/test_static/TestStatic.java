package test_static;
//to tell javac : avail directly out static member of  System class.
import static java.lang.System.out;

public class TestStatic {
	public static final double PI;
	static int counter = 10;
	private int i;// instance data member
	// static init block : invoked only once per class loading
	static {
		PI = 3.1414;
	//	i++;
		out.println("fm static init block counter = " + (counter++));
		testIt();

	}
	static {
		out.println("another static init block");
	}

	public TestStatic(int i) {
		out.println("in constr ");
		this.i = i;
	}

	// inst. init block : invoked once per instantiation BEFORE matching constr
	// typically replaced by a parameterized constr.
	{
		out.println("in inst init block");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		out.println("from  main " + counter);
		TestStatic t1 = new TestStatic(45);
		TestStatic t2 = new TestStatic(56);

	}

	static void testIt() {
		out.println("fm testIt counter=" + counter++);
	}

}
