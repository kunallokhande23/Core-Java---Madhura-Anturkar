package java8_strms;

import java.util.List;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.populateProductList;

public class Test8 {

	public static void main(String[] args) {
		
		//display the products from specified category , sorted as per desc order of manu. date
		try(Scanner sc=new Scanner(System.in))
		{
			//get populated product list for utils
			List<Product> productList = populateProductList();
			System.out.println("orig list");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter product category");
			Category cat=Category.valueOf(sc.next().toUpperCase());
			System.out.println("Filtered n sorted products  desc date");
			
			productList.stream() //Stream<Product> : all
			.filter(p -> p.getProductCategory()==cat) //Stream<Product> : filtered by category
			.sorted((p1,p2) -> p2.getManufactureDate().compareTo(p1.getManufactureDate()))
			.forEach(p -> System.out.println(p));
			System.out.println("printing list again ");
			productList.forEach(p -> System.out.println(p));
		
			
		}

	}

}
