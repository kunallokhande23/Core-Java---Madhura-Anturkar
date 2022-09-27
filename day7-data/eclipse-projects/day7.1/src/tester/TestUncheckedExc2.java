package tester;

public class TestUncheckedExc2 {

	public static void main(String[] args) {
		try {
			int a = 100;
			int b = 0;
			System.out.println("res " + (a / b));// no ArithmeticExc : un chked exc :
			String[] names = { "Nihkil", "Rama" };
			System.out.println(names[0]);// no AOBExc : un chked exc since it extends from RuntTimeExc class
			// javac DOES NOT force handling of the un chked excs
			System.out.println("Parsed double value : " + Double.parseDouble("abc1234"));//throw new NFE(...)
			System.out.println("end of try");
		}  catch (Exception e) {
	//		System.out.println("catch-all");
			//System.out.println(e.getMessage());
		//	System.out.println(e);//e.toString
			e.printStackTrace();
		}
		System.out.println("main continues....");

	}

}
