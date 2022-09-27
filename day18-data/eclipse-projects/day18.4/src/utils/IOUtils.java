package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface IOUtils {
//add a static method for restoring(or re-constructing) entire object graph (HM) from bin file , using de-serial.
	static Object restoreProducts(String fileName) throws IOException, ClassNotFoundException {
		// 1. create File cls instance
		File f1 = new File(fileName);
		if (f1.isFile() && f1.canRead()) {
			// attach data strms for de-serial
			// Java App <----OIS : de-serial(binary --> obj) <--- FIS <----bin file
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
				return in.readObject();
			}
		}
		else
			System.out.println("Invalid file name....");
	
		return null;
	}
}
