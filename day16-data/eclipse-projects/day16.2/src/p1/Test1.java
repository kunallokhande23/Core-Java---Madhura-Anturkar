package p1;

public class Test1 {

	public static void main(String[] args) {
		Formula[] formulae= {new MyFormula(),new AnotherFormula()};//up casting , objs : 3
		for(Formula f : formulae)
		{
			System.out.println(f.calculate(10));//run time poly.
			System.out.println(f.sqrt(15, 10));//run time poly.
		}

	}

}
