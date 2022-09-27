package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Copy the lines > 40 chars n upper case the contents n store it the dest file
 */
public class TestBufferedTextFileCopyFP2 {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name on 2 separate lines");
		try (// Scanner
				Scanner sc = new Scanner(System.in);
				// input chain : Java App <-----BR : buffered strm <---- FR : node strm <--- src
				// file
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()));
				// output chain : Java App --> PW : buffered strm ---> FW: node strm---> dest
				// file
				PrintWriter pw = new PrintWriter(new FileWriter(sc.nextLine(), true))) {
	//Declarative : Functional style of prog
			br.lines() //Stream<String> 
			.filter(l -> l.length()>40) //Stream<String> : filtered lines > 40
			.map(s -> s.toUpperCase()) //transformation string --> upper cased string
			.forEach(line -> pw.println(line));
			System.out.println("File copy done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
