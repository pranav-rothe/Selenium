package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	public void TC01() {
		Assert.assertEquals("a", "a", "Failure"); //hard Assertion
		Assert.assertEquals("a", "a", "Failure");
		Assert.assertEquals("a", "a", "Failure");
		Assert.assertNotEquals("a", "c", "Failure");
		Assert.assertNotEquals("a", "d", "Failure");
		Object Null = "string";
		//Assert.assertNotNull(Null,"Failure");
		Assert.assertNull(Null,"Failure");
		Assert.assertTrue(false, "Failure"); //expected should be true
		Assert.assertFalse(true, "Failure"); //expected should be false
	}
	
	@Test
	public void TC02() {
		System.out.println("TC02");
	}

}
