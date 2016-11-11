package clean_coding;

public class Item {
	
	private String description;
	private double price;
	private int amount;
	
	
	public Item(String description, double price) {
		
		this.description = description;
		this.price = price;
	}

	public void setAmount(int amount) {
		
		this.amount = amount;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public int getAmount() {
		
		return amount;
	}
	
	public double getSubtotal() {
	
		return price * amount;
	}
}
