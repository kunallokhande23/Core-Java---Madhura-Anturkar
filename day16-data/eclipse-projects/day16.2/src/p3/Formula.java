package p3;

interface Formula {
	double calculate(double a);// javac impl adds : public n abstract
	// public

	default  double sqrt(double a, double b) {// javac impl add : public
		System.out.println("invoking def method in i/f");
		return Math.sqrt(a + b);
	}
	//Can you add static methods in i/f ? YES
	//javac will impl. add : public 
	static void show()
	{
		System.out.println("in i/f 's static method....");
	}
}