package nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter src n dest file names ");
			Path src=Paths.get(sc.nextLine());
			Path dest=Paths.get(sc.nextLine());
			Files.copy(src,dest);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
