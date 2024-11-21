package testNG;

import org.testng.annotations.Test;

public class AlwaysRun_Parameter {
	
	@Test()
	public void TC01() {
		System.out.println("Test case one")  //gets failure
	}
	
	@Test(dependsOnMethods = {"TC01"})
	public void TC02() {
		System.out.println("Test case two");  //this method get skipped because its dependant on TC01
	}
	
	@Test(dependsOnMethods = {"TC01"},alwaysRun = true)
	public void TC03() {
		System.out.println("Test case three");  //always execute
	}
	
	@Test(alwaysRun = true)
	public void TC04() {
		System.out.println("Test case four"); //always execute
	}
	
	@Test
	public void TC05() {
		System.out.println("Test case five"); 
	}

}
