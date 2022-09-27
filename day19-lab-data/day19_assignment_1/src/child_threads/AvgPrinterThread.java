package child_threads;

import java.util.stream.IntStream;

public class AvgPrinterThread extends Thread {
	// state
	private int start, end;
	// ctor

	public AvgPrinterThread(int start, int end, String name) {
		super(name);// creeating new named thrd.
		this.start = start;
		this.end = end;
		System.out.println("in ctor of " + getClass() + " invoked by " + Thread.currentThread().getName());
		start();
	}

	@Override
	public void run() {
		System.out.println(getName() + " thread strted");
		try {
			System.out.println("Avg value ="+IntStream.rangeClosed(start, end).average().orElseThrow());

		} catch (Exception e) {
			System.out.println("err in thrd " + getName() + " exc " + e);
		}
		System.out.println(getName() + " thread over");
	}

}
