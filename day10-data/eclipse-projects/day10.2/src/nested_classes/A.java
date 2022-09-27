package nested_classes;

public class A {
	// Can outer class contain static as well as non static data members ? YES
	private int i;
	private static int j;
	static {
		j = 100;
		// l=1234;
	}

	public A(int i) {
		super();
		this.i = i;
	}

	// Can outer class contain static as well as non static methods ? YES
	public void outerShow() {
		// what all it can access ? i , j , both or neither ? : Both
		// can it access directly : k or l : neither
		B b1 = new B(456);
		System.out.println("in outer's show " + i + " " + j + " " + b1.k + " " + B.l);

	}

	public static void outerShow2() {
		// what all it can access directly ? i , j , both or neither ? : j (static)
		System.out.println("in outer's show2 " + j);
		// can it access directly : k or l : NO
		// how will you access k ?
	//	B b1 = new B(456); // javac err : since inner class instance HAS TO BE enclosed within outer class
							// instance
		A.B ref=new A(11).new B(22);
		System.out.println("in outer's show2 " + ref.k + " " + B.l);

	}

	// non static nested class : inner class
	// which are legal access specifiers for the innner class : private , default,
	// protected , public : any of it !
	public class B {
		// can you static or non static data members in the inner class ? : non static.
		// BUT can declare static constants
		private int k;
		// private static int l;
		private static final int l = 23456;

		// will allow static init block? NO
//		static {
//			
//		}
		// can u add ctor to init non static data memebrs ? YES
		public B(int k) {
			super();
			this.k = k;
		}

		// can u add non static method/s ? YES
		// Inner class can DIRECTLY access all (including private) members of the outer
		// class
		// why ? With every inner class : Java implicitly supplies Outer.this : instance
		// of the outer class
		public void innerShow() {
			// what all u can access ? i j k l : all of above
			System.out.println("from inner's show " + A.this.i + " " + j + " " + this.k + " " + l);// adding this as
																									// well as A.this :
																									// optional. Added
																									// only for your
																									// understanding!
		}
		// can you add a static method in the inner class ? NO
//		public static void testMe()
//		{
//			
//		}

	}

}
