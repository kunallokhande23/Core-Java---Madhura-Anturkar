package tester;

public class TestUncheckedExc {

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
		} catch (ArithmeticException e) {
			System.out.println(1);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(2);
		} catch (Exception e) {
			System.out.println("catch-all");
		}
		System.out.println("main continues....");

	}

}
