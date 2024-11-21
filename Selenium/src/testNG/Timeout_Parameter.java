package testNG;

import org.testng.annotations.Test;

public class Timeout_Parameter {
	
	@Test
	public void TC01() {
		System.out.println("Test case one");
	}
	
	@Test(timeOut = 5000)
	public void TC02() throws InterruptedException {
		Thread.sleep(7000);
		System.out.println("Test case two"); //org.testng.internal.thread.ThreadTimeoutException
	}
	
	@Test()
	public void TC03() {
		System.out.println("Test case three");
	}
	
	@Test()
	public void TC04() {
		System.out.println("Test case four");
	}
}
