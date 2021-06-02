public class BestSeller extends Book {
	private String summary;
	private int worldCopies;


	public BestSeller(int id, String name, double price, String summary, int worldCopies) {
		super(id, name, price);
		this.summary = summary;
		this.worldCopies = worldCopies;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String newSummary) {
		summary = newSummary;
	}

	public int getWorldCopies() {
		return worldCopies;
	}

	public void setWorldCopies(int newWorldCopies) {
		worldCopies = newWorldCopies;
	}

	@Override
	public boolean equals(Object o) {
		boolean isEqualBasic = super.equals(o);
		if (!isEqualBasic) {
			return false;
		} else if (!(o instanceof BestSeller)) {
			return false;
		} else if (o == this) {
			return true;
		} else {
			BestSeller otherBstSeller = (BestSeller) o;
			return summary.equals(((BestSeller) o).summary) &&
				   Integer.compare(worldCopies, ((BestSeller) o).worldCopies) == 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Summary: <" + summary + "> , <" + worldCopies + "> Copies Sold !";
	}


}






