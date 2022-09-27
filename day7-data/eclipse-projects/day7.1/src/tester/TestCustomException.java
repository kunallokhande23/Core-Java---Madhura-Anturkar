package tester;
import static utils.SpeedValidation.validateSpeed;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) /* throws SpeedOutOfRangeException */{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try");
		}//sc.close()
		catch (Exception e) {
			e.printStackTrace();//name , err mesg , location
		}
		System.out.println("main cntd....");

	}

}
