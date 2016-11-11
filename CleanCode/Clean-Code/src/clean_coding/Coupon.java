package clean_coding;

public class Coupon {
	
	private String title;
	private double discount;
	
	
	public Coupon(String title, double discount) {
		
		this.title = title;
		this.discount = discount;
	}


	public String getTitle() {
		
		return title;
	}


	public double getDiscount() {
		
		return discount;
	}

	

}
