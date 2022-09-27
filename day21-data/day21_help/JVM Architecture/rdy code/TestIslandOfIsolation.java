package tester;

public class TestIslandOfIsolation {
	TestIslandOfIsolation i;

	public static void main(String[] args) {
		TestIslandOfIsolation t1 = new TestIslandOfIsolation();
		TestIslandOfIsolation t2 = new TestIslandOfIsolation();

		t1.i = t2;
		t2.i = t1;

		t1 = null; // how many candidates for GC ?
		// requesting GC
		System.gc();
		System.out.println("after 1st GC");

		t2 = null; // how many candidates for GC ?

		// requesting GC
		System.gc();
		System.out.println("after 2nd GC");

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
}