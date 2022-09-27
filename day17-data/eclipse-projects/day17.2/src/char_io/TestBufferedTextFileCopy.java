package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestBufferedTextFileCopy {

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
			// read line of data from buffer of BR --->write it to buffer of PW ---continue
			// till EOF (end of strm)
			String s = null;
			while ((s = br.readLine()) != null) // EOF => null
				pw.println(s);
			System.out.println("File copy done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
