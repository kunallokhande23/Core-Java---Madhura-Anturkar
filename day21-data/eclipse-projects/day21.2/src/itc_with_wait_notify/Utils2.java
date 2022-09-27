package itc_with_wait_notify;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());// producer
		while (dataReady)
			this.wait();// p : Blocked on wait : outside the monitor belonging to Utils2 cls instance
						// (lock released)
		// datardy --false --continue to produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());// p
		dataReady = true;
		notify();// wakes up consumer : which is blocked on wait , on the same obj's monitor
	}// lock released , p : runnable

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());// c
		while (!dataReady)
			wait();// c : Blocked on wait --outside monitor
		// data is rdy ---continue to consume data
		System.out.println("Read  Data " + e);
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady = false;
		notify();// wakes up producer : which is blocked on wait , on the same obj's monitor
		return e;
	}// lock released , c : runnable

}
