package no_itc;
public class Utils2 {
	private Emp e;
	public synchronized void writeData(Emp ref) throws Exception {
		 System.out.println("w entered --- "+Thread.currentThread().getName());//producer
		 Thread.sleep(30);//p : Blocked on sleep --inside monitor 
		//produce data
		e = ref;
		System.out.println("Write Data " +e);
		 System.out.println("w exited --- "+Thread.currentThread().getName());//p
	
	}//lock released , p : runnable

	public synchronized Emp readData() throws Exception {
		 System.out.println("r entered --- "+Thread.currentThread().getName());// c 
		//consume data
		System.out.println("Read  Data " + e);
		Thread.sleep(100);//c : Blocked on sleep --inside monitor 
		 System.out.println("r exited --- "+Thread.currentThread().getName());
	
		return e;
	}//lock released , c : runnable

}
