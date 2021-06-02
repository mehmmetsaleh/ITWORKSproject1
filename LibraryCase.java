public class LibraryCase {

	public static void main(String[] args) throws NotInStockException {
		Storage libStorage = new Storage();

		Book firstBook = new Book(1, "Harry Potter and the chamber of secrets", 159.9);
		Book secondBook = new Book(2, "Lord Of the Rings", 70.0);
		Book thirdBook = new Book(3, "The Walking Dead", 99);

		BestSeller firstBest = new BestSeller(100, "Algorithms and DAST", 300,
											  "ground-breaking polynomial" + " " +
											  "algos", 15000);
		BestSeller secondBest = new BestSeller(101, "Probability and Statistics", 130, "all about " +
																					   "probability"
				, 10000);
		BestSeller thirdBest = new BestSeller(102, "Harry Potter and the half-blood prince", 350, "6th book",
											  80000);
		Book[] booksArray = {firstBook, secondBook, thirdBook, firstBest, secondBest, thirdBest};
		for (Book b : booksArray) {
			libStorage.addBook(b, 1);
		}
		System.out.println(firstBest);
		System.out.println(secondBest);
		System.out.println(thirdBest);

		for (Book b : booksArray) {
			System.out.println("name: " + b.getName() + ", amount: " + libStorage.getInStock(b));
		}
		System.out.println("------------------------------------------------------------------------------");
		libStorage.rentBook(firstBook);
		libStorage.rentBook(secondBest);
		try{
			libStorage.rentBook(firstBook);
		}
		catch (NotInStockException e){
			System.out.println("exception occurred!");
		}


		for (Book b : booksArray) {
			System.out.println("name: " + b.getName() + ", amount: " + libStorage.getInStock(b));
		}
		System.out.println("------------------------------------------------------------------------------");
		libStorage.returnBook(firstBook);

		for (Book b : booksArray) {
			System.out.println("name: " + b.getName() + ", amount: " + libStorage.getInStock(b));
		}
	}

}
