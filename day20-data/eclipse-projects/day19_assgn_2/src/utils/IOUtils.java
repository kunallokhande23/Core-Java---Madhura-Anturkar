package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Student;

public interface IOUtils {
//add static method to write Stream<Student> to a text file in buffered manner
	static void storeStudentDetails(Stream<Student> students,String fileName) throws IOException
	{
		//I/O Streams : Java App ---->PW --->FW ---> Text File
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			students.forEach(pw::println);//s -> pw.println(s)
		//	students.forEach(s -> pw.print(s+" ")); CAN NOT be replaced by a  method ref.
		}//pw.close
	}
}
