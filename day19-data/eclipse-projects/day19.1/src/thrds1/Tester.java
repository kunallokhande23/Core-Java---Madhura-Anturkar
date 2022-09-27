package thrds1;
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
			Thread.sleep(1000);
		}
		System.out.println("main over....");
		
	}

}
