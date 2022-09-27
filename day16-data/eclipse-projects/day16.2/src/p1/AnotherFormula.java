package p1;

public class AnotherFormula implements Formula {
	// which method/s MUST be imple for non abstract class ? calculate
	@Override
	public double calculate(double a) {
		System.out.println("imple abstract method in "+getClass());
		return a*10;
	}
	//Can imple class override  inherited def method imple  ? 

	@Override
	public double sqrt(double a, double b) {
		System.out.println("overriding inherited def method");
		return Math.sqrt(a-b);
	}
	

}
