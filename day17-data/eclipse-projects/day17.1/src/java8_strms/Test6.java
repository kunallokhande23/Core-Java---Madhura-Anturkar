package java8_strms;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.populateProductList;

public class Test6 {

	public static void main(String[] args) {
		
		//display the products from specified category having price < specified price
		try(Scanner sc=new Scanner(System.in))
		{
			//get populated product list for utils
			List<Product> productList = populateProductList();
			System.out.println("orig list");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter product category n price");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			System.out.println("Filtered products ");
			double price=sc.nextDouble();
			productList.stream() //Stream<Product> : all
			.filter(p -> p.getProductCategory()==cat) //Stream<Product> : filtered by category
			.filter(p -> p.getPrice()< price) //Stream<Product> : filtered by price
			.forEach(p -> System.out.println(p));
			
		}

	}

}
