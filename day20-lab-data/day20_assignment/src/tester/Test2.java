package tester;

import utils.SynchroUtils;

public class Test2 {
	 private static boolean exit;
	public static void main(String[] args) throws Exception{
		 //boolean exit=false;
		SynchroUtils u1 = new SynchroUtils();
		Thread t1 = new Thread(()  -> {
				while (!exit)
					u1.test();

			
		}, "t1");
		Thread t2 = new Thread(() -> {
				while (!exit)
					u1.testMe();

			
		}, "t2");//NEW
		t1.start();
		t2.start();
		System.out.println("Press enter to exit");
		System.in.read();//main thrd : blocked on i/p : till any key press
		exit=true;
		System.out.println("main waiting for child thrds to complete exec");
		t1.join();
		t2.join();
		System.out.println("main over...");

	}

}
