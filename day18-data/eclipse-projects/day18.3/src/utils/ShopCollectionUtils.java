package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.shop.core.Product;

import static com.shop.core.Category.*;
import static java.time.LocalDate.*;

public interface ShopCollectionUtils {
//add a static method to return List of some products'
	static List<Product> populateProductList() {
		// create empty ArrayList
		List<Product> list = new ArrayList<>();// size=0, init capa=10 : up casting
		// int productId, String name, String desc, int quantity, double price, Category
		// productCategory,
		// LocalDate manufactureDate
		list.add(new Product(10, "Brown_Bread", "Healthy Bread", 100, 40, BREAD, now()));
		list.add(new Product(100, "White_Bread", "Tasty Bread", 70, 35, BREAD, parse("2022-05-09")));
		list.add(new Product(50, "Marie", "Healthy Biscuits", 80, 10, BISCUITS, parse("2022-05-01")));
		list.add(new Product(40, "Monaco", "Salty Biscuits", 75, 15, BISCUITS, parse("2022-04-21")));
		list.add(new Product(60, "Sunflowe_Oil", "Healthy Oil", 50, 240, OIL, parse("2022-01-20")));
		list.add(new Product(70, "Gemini_Oil", "Vegetable Oil", 80, 220, OIL, parse("2022-01-30")));
		list.add(new Product(80, "Mango", "Seasonal Fruit", 45, 150, FRUITS, parse("2022-05-06")));
		list.add(new Product(15, "Watermelon", "Great Fruit", 60, 70, FRUITS, parse("2022-05-04")));
		list.add(new Product(83, "Orange", "Citrous Fruit", 40, 100, FRUITS, parse("2022-04-30")));
		list.add(new Product(17, "Apple", "Healthy Fruit", 52, 160, FRUITS, parse("2022-05-01")));

		return list;
	}

	// add a static method to return Map of products from populated list of products
	static Map<Integer, Product> populateProductMap(List<Product> productList) {
		Map<Integer, Product> map = new HashMap<>();// size=0, init capa=16 , load factor=.75
//		for (Product p : productList)
//			System.out.println("Put rets " + map.put(p.getProductId(), p));
		productList.forEach(p -> map.put(p.getProductId(), p));
		System.out.println("size of the map " + map.size());
		return map;
	}

	// add a static method : to sort the map of products as per the category
//n desc order of price n collect the result into a List
	static List<Product> sortProductsByCategoryNPrice(Map<Integer, Product> productMap) {
		// Is sorting criteria ---key based or value based ? : value based --easier
		// approach --convert it into collection view ---values 
		//values -- Collection<Product> ---> 
		//AL list=new AL<>(map.values());
		//list.sort(comp)
		Comparator<Product> comp=(p1,p2) -> {
			int ret=p1.getProductCategory().compareTo(p2.getProductCategory());//ordinal : pos based comparison
			if (ret==0)
				return ((Double)p2.getPrice()).compareTo(p1.getPrice());
			return ret;
		};
		return productMap.values() //Collection<Product>
				.stream() //Stream<Product> ----coll ---> strm
				.sorted(comp) //Stream<Product> : sorted as per compound criteria
				.collect(Collectors.toList());//stream ---> collection		
	}

}
