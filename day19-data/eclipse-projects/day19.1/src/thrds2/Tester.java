package thrds2;
import static java.lang.Thread.currentThread;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		//how many runnable thrds ? 1 : main
		System.out.println(Thread.currentThread());//Thread[main,5,main]
		//test concurrency -- create child thrds(user defined) n test it !
		System.out.println("main creating child thrds....");
		MyThread t1=new MyThread("one");
		MyThread t2=new MyThread("two");
		MyThread t3=new MyThread("three");
		MyThread t4=new MyThread("four");// 1 (main: parent) + 4 child thrds 
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " thrd , exec # " + i);
			Thread.sleep(100);
		}
	//	t1.start();//what will happen ?
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println(t1.isAlive()+" "+t4.isAlive());//t t
		t1.join();//main : Blocked on join : waiting for t1 
		t2.join();
		t3.join();
		t4.join();
	//	t2.start();//ITSExc : main
		System.out.println(t1.isAlive()+" "+t4.isAlive());//f f
		System.out.println("main over....");
		
	}

}
