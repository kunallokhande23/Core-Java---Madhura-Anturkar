package tester;

import java.util.Scanner;

import child_threads.AvgPrinterThread;
import child_threads.EvenPrinterThread;
import child_threads.OddPrinterThread;

public class TestConcurrency {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter begin n end of the range");
			int begin = sc.nextInt();
			int end = sc.nextInt();
			// launch child thrds
			EvenPrinterThread t1 = new EvenPrinterThread(begin, end, "even");
			//Help : in the imple Runnable : Thread t1=new Thread(new EvenPrinterTask(begin,end), "even");
			OddPrinterThread t2 = new OddPrinterThread(begin, end, "odd");
			AvgPrinterThread t3 = new AvgPrinterThread(begin, end, "avg");// main + 3 child thrds : runnable
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			t3.join();
			System.out.println(t1.isAlive() + " " + t2.isAlive() + " " + t3.isAlive());
			System.out.println("main over....");

		} catch (Exception e) {
			System.out.println("err in main thread " + e);
		}

	}

}
