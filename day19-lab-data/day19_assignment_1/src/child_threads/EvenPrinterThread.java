package child_threads;

import java.util.stream.IntStream;

public class EvenPrinterThread extends Thread {
	// state
	private int start, end;
	// ctor

	public EvenPrinterThread(int start, int end, String name) {
		super(name);// creating new named thrd. Thread(String name)
		this.start = start;
		this.end = end;
		System.out.println("in ctor of " + getClass() + " invoked by " + Thread.currentThread().getName());
		start();
	}

	@Override
	public void run() {
		System.out.println(getName() + " thread strted");
	//	try {
			IntStream.rangeClosed(start, end).filter(i -> i % 2 == 0).forEach(i -> {
				System.out.println("thrd " + getName() + " even no " + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					System.out.println("err in lambda expr of thrd " + getName() + " exc " + e);
				}
			});

//		} catch (Exception e) {
//			System.out.println("err in thrd " + getName() + " exc " + e);
//		}
		System.out.println(getName() + " thread over");
	}

}
