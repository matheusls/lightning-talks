package clean_coding;

import java.util.ArrayList;

public class Cart {

	private ArrayList<Item> items;
	private Coupon coupon;
	private boolean couponAdded;
	private int maxItems;

	public Cart(int maxItems) {

		this.maxItems = maxItems;
		this.items = new ArrayList<Item>();
		couponAdded = false;
	}

	public void setCoupon(String title , double discount) {

		coupon = new Coupon(title,discount);
		couponAdded = true;
	}

	public void addItem(String description , double price , int amount) {

		Item item = new Item(description, price);

		item.setAmount(amount);

		if(CanIAdd())
			items.add(item);
	}

	public Coupon getCoupon() {

		return coupon;
	}

	public int getMaxItems() {

		return maxItems;
	}

	public ArrayList<Item> getItems() {

		return items;
	}


	public double calcTotal() {

		double total = 0;

		for (Item item : items) {

			total += item.getSubtotal();
		}

		if(couponAdded) {

			total -= coupon.getDiscount();
		}

		return total;
	}

	public boolean CanIAdd() {

		return items.size() < maxItems;
	}
}
