package assertion;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	SoftAssert soft=new SoftAssert();
	
	
	@Test
	public void TC01() {
		soft.assertEquals(1, 5,"Fail");
		soft.assertNotEquals(1, 1);
		soft.assertTrue(false, "Failure"); //expected should be true
		soft.assertAll();
	}
	
	

}
