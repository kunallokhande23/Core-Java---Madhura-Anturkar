package thrds2;

public class MyThread extends Thread {
	// MyThread IS-A Thread
	public MyThread(String name) {
		super(name);// state : NEW named thrd.
		start();// state : RUNNABLE
	}

	@Override
	public void run()// throws InterruptedException
	{
		System.out.println(getName() + " strted");
		// B.L
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " thrd , exec # " + i);
//				if (getName().equals("two"))
//					Thread.sleep(200);
//				else
					Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + " thrd got exc : " + e);
		}
		System.out.println(getName() + " over");
//		if (getName().equals("two"))
//			start();
	}
}
