package p1;

public class MyFormula implements Formula {
	// which method/s MUST be imple for non abstract class ? calculate
	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method in "+getClass());
		return a*a;
	}
	//Can imple class inherit def method imple ? YES 

}
