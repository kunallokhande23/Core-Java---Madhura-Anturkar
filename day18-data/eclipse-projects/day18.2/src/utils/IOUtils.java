package utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Product;

public interface IOUtils {
//Save  product details from the map in a bin  file , in a buffered manner.(using conversion streams)
	static void storeProductDetails(Map<Integer, Product> map, String fileName) throws IOException {
		// chain of I/O streams
		// Java App ----> DOS ----> BOS ---> FOS ---> bin file
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
			map.forEach((k, v) -> IOUtils.writeProduct(v, out));
		}
	}

	// add static method to write product details
	static void writeProduct(Product p, DataOutputStream out) {
		try {
			// product id
			out.writeInt(p.getProductId());
			// name,
			out.writeUTF(p.getName());
			// String desc
			out.writeUTF(p.getDesc());
			// , int quantity
			out.writeInt(p.getQuantity());
			// , double price,
			out.writeDouble(p.getPrice());
			// productCategory-> string --writeUTF : toString or name()
			out.writeUTF(p.getProductCategory().toString());
			// LocalDate manufactureDate --string --writeUTF
			out.writeUTF(p.getManufactureDate().toString());
		} catch (IOException e) {
			System.out.println("err in writing " + e);
		}
	}

	// add static method to restore product details from bin file
	static List<Product> restoreProducts(String fileName) throws IOException {
		List<Product> products = new ArrayList<>();
		// validate if file exists n chk for read permission
		// 1. Create File class instance to wrap path
		File file = new File(fileName);
		if (file.isFile() && file.canRead()) {
			// attach i/o strms
			// Java App <----DIS <----BIS <---- FIS <--- bin file
			try (DataInputStream in = new DataInputStream(new BufferedInputStream
					(new FileInputStream(file)))) {
				while (true) {
					// read product details --> encap. in the product obj n add it's ref in the list
					// int productId, String name, String desc, int quantity, double price, Category
					// productCategory,
					// LocalDate manufactureDate
					products.add(new Product(in.readInt(), in.readUTF(), in.readUTF(), 
							in.readInt(), in.readDouble(),
							Category.valueOf(in.readUTF()), LocalDate.parse(in.readUTF())));
				}
			} catch (EOFException e) {
				System.out.println("end of file reached...." + e);
			}

		} else
			System.out.println("Invalid File Name!!!!!!!!!!!!");
		return products;
	}

}
