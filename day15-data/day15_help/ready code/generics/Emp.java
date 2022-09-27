package generics;

public class Emp {
	private double basic;

	public Emp(double basic) {
		super();
		this.basic = basic;
	}

	public void computeSalary() {
		System.out.println("emp's compute sal");
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
