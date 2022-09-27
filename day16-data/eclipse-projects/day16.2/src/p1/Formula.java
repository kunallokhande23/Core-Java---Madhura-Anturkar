package p1;

interface Formula {
	double calculate(double a);// javac impl adds : public n abstract
	// public

	default  double sqrt(double a, double b) {// javac impl add : public
		System.out.println("invoking def method in i/f");
		return Math.sqrt(a + b);
	}
}