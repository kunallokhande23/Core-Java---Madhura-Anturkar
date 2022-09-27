package nio2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name of file : to read data ");
			Files.lines(Paths.get(sc.nextLine())).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
