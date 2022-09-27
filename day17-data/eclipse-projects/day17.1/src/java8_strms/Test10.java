package java8_strms;

import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

import static utils.ShopUtils.populateProductList;

public class Test10 {

	public static void main(String[] args) {

		// display the average prices products from specified category.
		try (Scanner sc = new Scanner(System.in)) {
			// get populated product list for utils
			List<Product> productList = populateProductList();
			System.out.println("orig list");
			productList.forEach(p -> System.out.println(p));
			System.out.println("Enter product category");
			Category cat = Category.valueOf(sc.next().toUpperCase());

			OptionalDouble optional = productList.stream() // Stream<Product> : all
					.filter(p -> p.getProductCategory() == cat) // Stream<Product> : filtered by category
					.mapToDouble(p -> p.getPrice()) // DoubleStream : product price
					.average();// specialized reduce op : returning OptionalDouble
			if (optional.isPresent())
				System.out.println("Avg of prices " + optional.getAsDouble());
			else
				System.out.println("Empty Optional!!!!!!!!!!!!!!");

		}

	}

}
