package dirty_coding;

public class Cart {
	private String ttle;
	private double dscnt = 0;
	private double t = 0;
	private Item[] Items;
	public String getTtle() {
		return ttle;
	}
	public void calcTtle(String ttle) {
		this.ttle = ttle;
	}
	public double getDscnt() {
		return dscnt;
	}
	public void setDscnt(double dscnt) {
		this.dscnt = dscnt;
	}
	public double getT() {
		if(dscnt > 0) {
			calcT();
		}
		else {
			calcTDscnt();
		}
		return t;
	}
	int i = 0;
	public void calcT() {
		int j;
		for(j=0;j<i;j++) 
		{
			t += Items[j].getPrce() * Items[j].getQtt();
		}
		t -= dscnt;
	}
	public void calcTDscnt() {
		int j;
		for(j=0;j<i;j++) 
		{
			t += Items[j].getPrce() * Items[j].getQtt();
		}
	}
	public Item[] getItems() {
		return Items;
	}
	public void setItems() {
		Items = new Item[qtIt];
	}
	public void addItem(Item item) {
		if(i < qtIt)
		Items[i++] = item;
	}
	private int qtIt;
	public int getQtIt() {
		return qtIt;
	}
	public void setQtIt(int qtIt) {
		this.qtIt = qtIt;
	}
	
}
