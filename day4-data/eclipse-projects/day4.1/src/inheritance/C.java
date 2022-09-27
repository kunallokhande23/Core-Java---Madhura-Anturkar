package inheritance;

public class C extends B
{
	C()
	{
		//super(); => javac impl adds invocation of IMMEDIATE super ctor
		System.out.println("In C");
	}
}
