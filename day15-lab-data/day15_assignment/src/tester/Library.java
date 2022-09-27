package tester;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Book;

import static utils.LibraryUtils.populateBooks;
import static com.app.core.Category.valueOf;
import static java.time.LocalDate.parse;

public class Library {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map of books
			Map<String, Book> books = populateBooks();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 0.Login 1.Add A Book 2.Display All Books 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 0: // Login : Complete it whenever u get time !!!!!!!!!
						break;
					case 1: // add a book
						sc.nextLine();// reading off pending new line after selecting an option
						System.out.println("Enter book title");
						String title = sc.nextLine();
						Book b = books.get(title);
						if (b == null) // => a new book --so prompt for all the details
						{
							System.out.println(
									"Enter new book details : category,  price,  publishDate(yr-mon-day),  authorName,  quantity");
							books.put(title, new Book(title, valueOf(sc.next().toUpperCase()), sc.nextDouble(),
									parse(sc.next()), sc.next(), sc.nextInt()));
							System.out.println("a new book added ....");

						} else // => existing book , so just ask for additional qty
						{
							System.out.println("Enter additional qty");
							b.setQuantity(b.getQuantity() + sc.nextInt());
							System.out.println("qty updated...");
						}
						break;
					case 2:
						System.out.println("All books in the library");
						for(Book b1 : books.values())
							System.out.println(b1);
							
						
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}
		}

	}

}
