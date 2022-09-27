package p2;

public class MyFormula implements Formula, Formula2 {

	@Override
	public double calculate(double a) {
		// TODO Auto-generated method stub
		return 0;
	}
	// If there is dup def method imple from multiple i/fs --- what is mandatory
	// ---imple class MUST override def method impl.
	@Override
	public double sqrt(double a, double b) {// javac impl add : public
		System.out.println("overridng dup def method inherited from i/fs");
		//Can u access i/f def method ? YES
		System.out.println(Formula.super.sqrt(a,b));
		System.out.println(Formula2.super.sqrt(a, b));
		return Math.sqrt(a * b);
	}
}
