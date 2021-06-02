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

	public String rentBook(Book book) throws NotInStockException{
		if (!inStock.containsKey(book) || inStock.get(book) == 0) {
			throw new NotInStockException("No copys of "+ book.getName()+ " left in stock!");
		} else {
			inStock.put(book, inStock.get(book) - 1);
			return book.getName();
		}
	}

	public void returnBook(Book book) {
		if (inStock.containsKey(book)) {
			inStock.put(book, inStock.get(book) + 1);
		}
	}

	public int getInStock(Book book) {
		if (!inStock.containsKey(book)) {
			return 0;
		} else {
			return inStock.get(book);
		}
	}
}
