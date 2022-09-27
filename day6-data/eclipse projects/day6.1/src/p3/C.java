package p3;

public class C implements A,B{

	//Can imple class DIRECTLY access DUPLICATE data member ? NO
	@Override
	public double add(double a, double b) {
		System.out.println(A.DATA+" "+B.DATA);
		return a+b;
	}

	@Override
	public double add(double a, double b, double c) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
