package clean_coding;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCart {
	
	private Cart cart;
	
	@Before
	public void setUp() throws Exception {
		
		cart = new Cart(2);
		
		cart.addItem("Lightsaber", 78.00, 3);
		cart.addItem("Stormtrooper Helmet", 30.00, 1);
	}


	@Test
	public void testAddItem() {
		
		cart.addItem("Jedi Cloath", 200.70 , 3);
		
		Assert.assertNotEquals(3, cart.getItems().size());
	}
	
	@Test
	public void testGetTotal() {
		
		Assert.assertEquals(264.0,cart.calcTotal(),0);
	}
	
}
