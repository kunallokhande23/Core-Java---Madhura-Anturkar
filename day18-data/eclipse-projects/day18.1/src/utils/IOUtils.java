package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.shop.core.Product;

public interface IOUtils {
//Save list of sorted product details  in a text file , in a buffered manner.
	static void storeProductDetails(List<Product> products,String fileName) throws IOException
	{
		//Java App --PW ---FW--> Text File
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			//write data to a buffer ---> file
			products.forEach(p -> pw.println(p));
			
		}//pw.close --- flushes out buufer contents --closes the file n PW.
	}
}
