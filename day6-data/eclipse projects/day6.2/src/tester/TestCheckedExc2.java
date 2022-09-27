package tester;

public class TestCheckedExc2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Before sleep");

		Thread.sleep(5000); // javac FORCES handling of chked excs (not extending from RuntimeExc)

		System.out.println("After sleep");

	}

}
