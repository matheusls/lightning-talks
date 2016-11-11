package clean_coding;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCoupon {
	
	private Coupon coupon;
	
	@Before
	public void setUp() throws Exception {
		
		coupon = new Coupon("ANDROIDIZIZI" , 20.00);
	}

	@Test
	public void testGetTitle() {
		
		Assert.assertEquals("ANDROIDIZIZI", coupon.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		//in the case you need to do anything
		//after the test
	}
}
