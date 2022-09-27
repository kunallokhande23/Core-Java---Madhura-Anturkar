package inheritance2;

public class Person {
	// tightly encap state
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		// super();
		System.out.println("1");
		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
	// add overriding form of the toString (inherited from Object class) : to
	// replace F.QclsName@hashCode version by actual details
	@Override
	public String toString()
	{
		return firstName+" "+lastName;
	}

}
