package nested;

class Outer1 {
	int Outer1_x = 100;
	static int Outer1_static = 10;

	void test() {
		// Outer1 class's can
		System.out
				.println("invoking non-static member of the inner class : after creating an instance");
		Inner inner = new Inner();
		inner.display();
	}

	static void test1() {// Outer1 class's static member cant access/instantiate
							// Inner class in any way.: so cant access its
							// instance members.(for this u 1st have to
							// instantiate Outer1 class then inner class.
		System.out
				.println("static Outer1 member :invoking non-static member of the inner class : after creating an instance");
		// so following wont work
		Inner inner = new Inner();
		inner.display();
		// but following works
		Outer1.Inner inner1 = new Outer1().new Inner();
		inner1.display();
		// Outer1 class's static member can access Inner class's static members
		Inner.displayStatic();

	}

	// this is an innner class
	class Inner {
		// Inner(i.e non-static nested) class cant contain any static members.
		static void displayStatic() {
			System.out.println("within inner static method");

		}

		void display() {
			// non-static member of Inner class : can access directly both
			// static/non-static members of the Outer1 class.
			System.out.println("display: Outer1_x = " + Outer1_x
					+ " Outer1 static data=" + Outer1_static);
			// non-static member of Inner class : can access only static member
			// of the static nested class.
			SInner.displayStatic2();
		}
	}

	static class SInner {
		static void displayStatic2() {
			System.out.println("within inner static method2 " + Outer1_static);

		}

		void display2() {
			System.out.println("display: Outer1_x = " + Outer1_x
					+ " Outer1 static data=" + Outer1_static);
		}
	}
}

// 'static' keyword/modifier cant be applied to any Outer1 class.
class InnerClassTest {
	public static void main(String args[]) {
		Outer1 Outer1 = new Outer1();
		Outer1.test();
	}
}
