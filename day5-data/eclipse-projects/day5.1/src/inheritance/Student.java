package inheritance;

public class Student extends Person {
//additional state : 
	private int gradYear;
	private String courseName;
	private double fees;
	private int marks;

	public Student(String fn, String ln, int gradYear, String course, double fees, int marks) {
		super(fn, ln);
		System.out.println("2");
		this.gradYear = gradYear;
		this.courseName = course;
		this.fees = fees;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + " graduated in" + gradYear 
				+ " course : " + courseName + " fees " + fees
				+ " marks" + marks;//super keyword : mandatory : o.w recursion
	}
	//add study() method : to display firstName of the student studying in course
//	@Override
	public void study()
	{
		System.out.println(super.getFirstName()+" studying in course : "+this.courseName);//super : optional
	}
}
