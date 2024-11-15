package testNG;

import org.testng.annotations.Test;

public class Priority_Keyword_TestAno {
	
	@Test(priority = 1)
	public void TC01() {
		System.out.println("userone");
	}
	
	@Test
	//By default priority is zero when we are not giving a priority for particular method
	public void TC02() {                   
		System.out.println("usertwo");
	}
	
	@Test(priority = -2)
	public void TC03() {
		System.out.println("userthree");
	}
	
	@Test(timeOut = 3000)
	public void TC04() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("userfour");
	} 
	
	@Test(enabled = false)
	public void TC05() {
		System.out.println("userfive");
	} 
}
