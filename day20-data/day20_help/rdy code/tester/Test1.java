package tester;

import java.io.IOException;

import utils.SynchroUtils;

public class Test1 {
	 private static boolean exit;
	public static void main(String[] args) throws Exception{
		
		SynchroUtils u1 = new SynchroUtils();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (!exit)
					u1.test();

			}
		}, "t1");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (!exit)
					u1.test();

			}
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
