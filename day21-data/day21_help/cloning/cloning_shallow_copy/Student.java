package cloning_shallow_copy;

public class Student  implements Cloneable {
	private int rollNo;
	private Address adr;

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	@Override
	public String toString() {
		return "Student rollNo=" + rollNo + " " + adr;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Address getAdr() {
		return adr;
	}
	@Override
	public  Student clone() throws CloneNotSupportedException
	{
		return (Student) super.clone();
	}
}
