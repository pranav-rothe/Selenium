package testNG;

import org.testng.annotations.Test;

public class Enabled_Parameter {
		
		@Test(enabled =  false)
		public void TC01() {
			System.out.println("Test case one");  //not executed
		}
		
		@Test
		public void TC02() {
			System.out.println("Test case two");
		}
		
		@Test(enabled = false)
		public void TC03() {
			System.out.println("Test case three");  //not executed
		}
		
		@Test
		public void TC04() {
			System.out.println("Test case four");
		}
		
		@Test
		public void TC05() {
			System.out.println("Test case five");
		}
}

