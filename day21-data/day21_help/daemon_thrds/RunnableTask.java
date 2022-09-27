package daemon_thrds;

public class RunnableTask implements Runnable {

//overriding form of the run() can't add any NEW checked excs
	@Override
	public void run() {
		// thrd name strted
		System.out.println(Thread.currentThread().getName() + " strted ");
		try {
			// B.L : dummy for loop
			for (int i = 0; i < 10; i++) {
				if (Thread.currentThread().getName().equals("two")) {
					System.out.println("Enter data");
					int data = System.in.read();
				}
				System.out.println(Thread.currentThread().getName() + " exec # " + i);
				// sleep : for real world testing : it simulates practical delays n to force ctx
				// switching
				Thread.sleep(500);
			}

		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " exc " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over ");
	}
}
