package utils;

public class Emp implements Comparable<Emp>{
	private double basic;

	public Emp(double basic) {
		super();
		this.basic = basic;
	}

	public void computeSalary() {
		System.out.println("emp's compute sal");
	}

	@Override
	public String toString() {
		return " [basic=" + basic + "]";
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return ((Double)basic).compareTo(o.basic);
	}
	
	

}

class Mgr extends Emp {
	public Mgr(double basic) {
		super(basic);
	}

	@Override
	public void computeSalary() {
		System.out.println("mgr's compute sal");
	}
}

class SalesMgr extends Mgr {
	public SalesMgr(double basic) {
		super(basic);
	}

	@Override
	public void computeSalary() {
		System.out.println("sales mgr's compute sal");
	}
}

class Worker extends Emp {
	public Worker(double basic) {
		super(basic);
	}

	@Override
	public void computeSalary() {
		System.out.println("worker's compute sal");
	}
	
}

class TempWorker extends Worker {
	public TempWorker(double basic) {

		super(basic);
	}

	@Override
	public void computeSalary() {
		System.out.println("temp worker's  compute sal");
	}
}
