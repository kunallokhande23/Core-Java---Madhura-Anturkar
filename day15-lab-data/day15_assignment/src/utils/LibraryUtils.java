package utils;

import static com.app.core.Category.HORROR;
import static com.app.core.Category.ROMANCE;
import static com.app.core.Category.SCIENCE;
import static java.time.LocalDate.parse;

import java.util.HashMap;
import java.util.Map;

import com.app.core.Book;

public class LibraryUtils {
	// add a static method to return populate map of books
	public static Map<String, Book> populateBooks() {
		HashMap<String, Book> books = new HashMap<>();
		// category, double price, LocalDate publishDate, String authorName, int
		// quantity
		System.out.println("Added "
				+ books.put("SC Book 1", new Book("SC Book 1", SCIENCE, 500, parse("2018-12-23"), "Amit", 50)));
		System.out.println("Added " + books.put("Horror Book 2",
				new Book("Horror Book 2", HORROR, 450, parse("2019-12-23"), "Prakash", 60)));
		System.out.println("Added " + books.put("Romance Book 1",
				new Book("Romance Book 1", ROMANCE, 300, parse("2018-05-23"), "Riya", 54)));
		System.out.println("Added "
				+ books.put("SC Book 3", new Book("SC Book 3", SCIENCE, 520, parse("2019-12-20"), "Amit", 56)));
		System.out.println("Added " + books.put("Horror Book 1",
				new Book("Horror Book 1", HORROR, 590, parse("2017-12-23"), "Prakash", 70)));
		System.out.println("Added "
				+ books.put("SC Book 2", new Book("SC Book 2", SCIENCE, 580, parse("2018-01-06"), "Amit", 30)));
		return books;
	}

}
