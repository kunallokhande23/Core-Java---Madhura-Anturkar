package tester;

public class TestUncheckedExc {

	public static void main(String[] args) {
		int a=100;
		int b=10;
		System.out.println("res "+(a/b));// no ArithmeticExc : un chked exc :
		String[] names= {"Nihkil","Rama"};
		System.out.println(names[0]);//no AOBExc : un chked exc since it extends from RuntTimeExc class 
		//javac DOES NOT force handling of the un chked excs
		System.out.println("Parsed double value : "+Double.parseDouble("abc1234"));
		System.out.println("main over...");

	}

}
