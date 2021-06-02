public class Book {
	private int id;
	private String name;
	private double price;

	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

	}

	public int getId() {
		return id;
	}

	public void setId(int newID) {
		id = newID;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Book)) {
			return false;
		}
		if (o == this) {
			return true;
		}
		Book other = (Book) o;
		return Integer.compare(id, other.id)== 0 && name.equals(other.name) && Double.compare(price,
																							   other.price)==0;
	}
	@Override
	public String toString(){
		return "<"+ name + ">" + "- <" + price + ">";
	}
}
