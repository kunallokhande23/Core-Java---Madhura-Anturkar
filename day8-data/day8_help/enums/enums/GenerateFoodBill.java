package enums;

import java.util.Scanner;

public class GenerateFoodBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		// how to trigger loading of enum type?
		Menu m1 = Menu.NOODLES;
		int bill = 0;
		while (!exit) {
			try {
				// display food menu along with its price
				// values -- Menu[]
				System.out.println("Menu :");
				for (Menu m : Menu.values())
					System.out.println(m);
				
				System.out.println("Pls enter food item n quantity");
				// valueOf to convert String ---enum
				Menu m = Menu.valueOf(sc.next().toUpperCase());
				int qty = sc.nextInt();
				// enums can be used as a switch argument
				switch (m) {
				case SOUP:
				case RICE:
				case NOODLES:
					bill += (qty * m.getPrice());
					break;

				}

			}catch (IllegalArgumentException e)
			{
				System.out.println("Generating Bill");
				exit=true;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Total Bill "+bill);
		if (sc != null)
			sc.close();

	}

}
