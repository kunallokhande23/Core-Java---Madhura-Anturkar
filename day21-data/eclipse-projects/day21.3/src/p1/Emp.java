package p1;

public class Emp {
	private int id;
	private String name;
	private double salary;
	public static int noOfEmps;
	double grade;
	public Emp(int id, String name, double salary,double grade) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.grade=grade;
		noOfEmps++;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static int getNoOfEmps() {
		return noOfEmps;
	}
	public static void setNoOfEmps(int noOfEmps) {
		Emp.noOfEmps = noOfEmps;
	}
	private void updateSalary(double incr)
	{
		System.out.println("in update sal");
		salary+=incr;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", grade=" + grade + "]";
	}
	
	
}
