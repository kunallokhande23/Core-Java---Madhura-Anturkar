package thrds5;

import static java.lang.Thread.currentThread;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// how many runnable thrds ? 1 : main
		System.out.println(Thread.currentThread());// Thread[main,5,main]
		// test concurrency -- create child thrds(user defined) n test it !
		System.out.println("main creating child thrds....");
		// Create Thread cls instance by supplying Runnable task
		// Thread(Runnable task,String name)
		MyRunnableTask task = new MyRunnableTask();// how many runnable thrds ? : 1(main)
		Thread t1 = new Thread(task, "one");
		Thread t2 = new Thread(task, "two");
		Thread t3 = new Thread(task, "three");
		Thread t4 = new Thread(task, "four");// how many runnable thrds ? : 1
		t1.start();
		t2.start();
		t3.start();
		t4.start();// how many runnable thrds ? 1 + 4
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " thrd , exec # " + i);
			Thread.sleep(100);
		}

		System.out.println("main waiting for child thrds to complete exec");
		System.out.println(t1.isAlive() + " " + t4.isAlive());// t t
		t1.join();// main : Blocked on join : waiting for t1
		t2.join();
		t3.join(5000);//main will be Blocked on join for max : 5 secs :tmout
		t4.join();
		System.out.println(
				"What will be o/p , if user DOES NOT press Enter even once " + t3.isAlive() + " " + t4.isAlive());//t f

		System.out.println(t1.isAlive() + " " + t4.isAlive());// f f
		//main ---> sends interrupt signal to t3
		System.out.println("main sending interrupt to t3");
		t3.interrupt();
		t3.join();//what will happen if user DOES NOT press Enter even once ? 
		
		System.out.println("main over....");

	}

}
