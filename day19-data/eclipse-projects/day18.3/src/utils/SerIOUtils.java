package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.shop.core.Product;

public interface SerIOUtils {
//add a static method for storing product details in a bin file : using serialization (OOS)
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException {
		// chain of I/O strms
		// Java App ---> OOS : ser. --> bin stream(state + meta data) --> FOS ---> bin
		// file
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			// Method of OOS : public void writeObject(Object o) throws IOExc....
			out.writeObject(map);// JVM checks the serializability of the entire obj graph : any time it comes
									// across any non serializable obj --abort ser. --throws
									// java.io.NotSerializableExc
		}
	}
}
