package nio;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReadChannelBuffer2 {
	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in); 
			   FileChannel fc = FileChannel.open(Paths.get(sc.nextLine()))) {

			// position=0,limit=capacity=size
			ByteBuffer buffer = ByteBuffer.allocate((int) fc.size());//eg file size in bytes
			fc.read(buffer);// read data from FC & write it to a buffer.
			// position =limit=capacity
			buffer.flip();// limit=position, pos=0
			String str = Charset.forName("UTF-8").decode(buffer).toString();
			System.out.println(str);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
