package nested;

public class Outer4 {
	private int size = 5;

	public void makeTheInner(int localVar) {
		// if data is not final, can't be accessed from within method local
		// inner class.
		final int finalLocalVar = 6;
	//	Uncomment it : understand the err
	//	Inner in = new Inner();
		// Declare a class within a method
		class Inner {
			int innerData = 100;

			public String toString() {
				return "Inner size = " + size + "finalLocalVar = " + finalLocalVar;
			}

			void show() {
				System.out.println("Inner data " + innerData + " outer data "
						+ size);
			}
		}
		Inner in = new Inner();
		in.show();

	}
/*	Uncomment it : understand the err 
 * void anotherMethod()
	{
		Inner in = new Inner();
	}*/

	public static void main(String[] ss) {
		new Outer4().makeTheInner(10);

	}
}