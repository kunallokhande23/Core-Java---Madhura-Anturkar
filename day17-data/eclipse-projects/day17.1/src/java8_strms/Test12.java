package java8_strms;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import custom_exceptions.ProductNotFoundException;

import static utils.ShopUtils.populateProductList;

public class Test12 {

	public static void main(String[] args) {

		// display the average prices products from specified category, in case of empty
		// stream , throw custom exc :ProductNotFoundExc
		try (Scanner sc = new Scanner(System.in)) {
			// get populated product list for utils
			List<Product> productList = populateProductList();
			System.out.println("orig list");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter product category");
			Category cat = Category.valueOf(sc.next().toUpperCase());

			System.out.println("Avg of prices " + productList.stream() // Stream<Product> : all
					.filter(p -> p.getProductCategory() == cat) // Stream<Product> : filtered by category
					.mapToDouble(p -> p.getPrice()) // DoubleStream : product price
					.average()
					//Supplier : Func i/f 
					.orElseThrow(() -> new ProductNotFoundException("Chosen Category has not Products!!!!!!")));// specialized
																												// reduce
																												// op :
																												// returning
																												// OptionalDouble

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
