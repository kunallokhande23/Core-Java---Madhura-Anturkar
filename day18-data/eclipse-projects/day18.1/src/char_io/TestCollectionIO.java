package char_io;

import java.util.Scanner;
import static utils.ShopCollectionUtils.*;
import static utils.IOUtils.storeProductDetails;

public class TestCollectionIO {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter file name");
			// store product details
			storeProductDetails(sortProductsByCategoryNPrice(populateProductMap(populateProductList())),
					sc.nextLine());
			System.out.println("Stored sorted product details");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
