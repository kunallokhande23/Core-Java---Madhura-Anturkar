package nested;

class MyOuter {
	private int x = 7;

	public void makeInner() {
		MyInner in = new MyInner();
		in.seeOuter(10);
	}

	class MyInner {
		int x = 8;

		public void seeOuter(int x) {
			System.out.println("Local x is " + x);
			System.out.println("Inner class's x is " + this.x);
			System.out.println("Outer class's x is " + MyOuter.this.x);
		}
	}

	public static void main(String[] args) {
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter(9);
	}
}