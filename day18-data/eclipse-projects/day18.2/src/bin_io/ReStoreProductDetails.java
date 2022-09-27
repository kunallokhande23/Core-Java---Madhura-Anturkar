package bin_io;

import static utils.IOUtils.restoreProducts;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Product;

public class ReStoreProductDetails {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter bin file name , to restore product details from ");
			List<Product> list = restoreProducts(sc.nextLine());
			if (list.isEmpty())
				System.out.println("No products!!!!!!!!!!!!!!!!");
			else {
				System.out.println("Products restored : ");
				list.forEach(p -> System.out.println(p));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
