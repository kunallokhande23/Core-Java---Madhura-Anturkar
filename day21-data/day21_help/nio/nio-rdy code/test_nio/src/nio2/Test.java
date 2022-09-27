package nio2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter name of directory , to be created ");
			Path path = Paths.get(sc.nextLine());
			System.out.println(Files.exists(path));//false
			Path dir = Files.createDirectory(path);
			System.out.println(Files.exists(dir));//true
			System.out.println("Enter name of file to create");
			Path createFile = Files.createFile(Paths.get(sc.next()));
			System.out.println(Files.exists(createFile));//true
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
