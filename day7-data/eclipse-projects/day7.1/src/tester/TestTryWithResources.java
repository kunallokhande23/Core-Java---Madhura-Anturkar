package tester;

import java.util.Scanner;

public class TestTryWithResources {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("val " + Integer.parseInt("sdgasd"));
		} //JVM : sc.close() ----matching exc handler --catch --yes  -invokes catch --continues
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
