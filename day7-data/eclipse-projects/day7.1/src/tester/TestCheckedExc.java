package tester;

public class TestCheckedExc {

	public static void main(String[] args) {
		System.out.println("Before sleep");
		try {
			Thread.sleep(5000); // javac FORCES handling of chked excs (not extending from RuntimeExc)
			System.out.println("end of try....");
		} catch (InterruptedException e) {
			System.out.println("sleep interupted!!!!!!!!!!!!!!!");
		}
		System.out.println("After sleep");

	}

}
