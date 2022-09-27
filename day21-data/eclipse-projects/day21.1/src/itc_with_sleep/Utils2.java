package itc_with_sleep;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());// producer
		while (dataReady)
			Thread.sleep(30);// p : Blocked on sleep --inside monitor
		//datardy --false --continue to  produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());// p
		dataReady=true;

	}// lock released , p : runnable

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());// c
		while(!dataReady)
			Thread.sleep(100);// c : Blocked on sleep --inside monitor
		// data is rdy ---continue to consume data
		System.out.println("Read  Data " + e);		
		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady=false;
		return e;
	}// lock released , c : runnable

}
