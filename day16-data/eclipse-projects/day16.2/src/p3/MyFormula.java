package p3;

public class MyFormula implements Formula {
	// which method/s MUST be imple for non abstract class ? calculate
	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method in "+getClass());
		return a*a;
	}
	//Can imple class inherit def method imple ? YES 
	//Can u override a static method inherited from i/f ? NO
	//BUT can u re declre it ? YES
	static void show()
	{
		System.out.println("in cls's static method....");
		//How to refer to i/f static method ? i/fName.methodName
		Formula.show();
	}

}
