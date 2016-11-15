package clean_coding;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestItem {
	
	private Item item_1;
	
	@Before
	public void setUp() throws Exception {
		
		item_1 = new Item("Han Solo's Jacket", 300.00);
		item_1.setAmount(2);
	}
	
	@Test
	public void testGetTitle() {
		
		Assert.assertEquals("Han Solo's Jacket",item_1.getDescription());
	}
	
	@Test
	public void testGetSubtotal() {
		
		Assert.assertEquals(600, item_1.getSubtotal(),0);
	}
	
	
	@After
	public void tearDown() throws Exception {
		//in the case you need to do anything
		//after the test
	}
}
