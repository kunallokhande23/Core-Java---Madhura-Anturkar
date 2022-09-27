package tester;

import java.util.Scanner;
import static utils.IOUtils.restoreProducts;

public class RestoreProducts {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter bin file name");
			System.out.println(restoreProducts(sc.nextLine()));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
