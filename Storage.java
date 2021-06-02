import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storage {
	private final static int BOOKS_CAP = 6;
	private final static int INSTOCK_CAP = 6;
	private Set<Book> books;
	private Map<Book, Integer> inStock;


	public Storage() {
		this.books = new HashSet<>(BOOKS_CAP);
		this.inStock = new HashMap<>(INSTOCK_CAP);
	}

	public void addBook(Book newBook, int amount) {
		books.add(newBook); // adds the book if not already in books, otherwise does nothing
		if (!inStock.containsKey(newBook)) {
			inStock.put(newBook, amount); // autoboxing
		} else {
			inStock.put(newBook, inStock.get(newBook) + amount);
		}
	}

	



}
