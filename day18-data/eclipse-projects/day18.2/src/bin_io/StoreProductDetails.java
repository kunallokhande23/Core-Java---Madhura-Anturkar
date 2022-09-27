package bin_io;

import java.util.Scanner;
import static utils.IOUtils.storeProductDetails;
import static utils.ShopCollectionUtils.*;

public class StoreProductDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter bin file name , to store product details");
			storeProductDetails(populateProductMap(populateProductList()),sc.nextLine());
			System.out.println("stored product details ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");
	}

}
