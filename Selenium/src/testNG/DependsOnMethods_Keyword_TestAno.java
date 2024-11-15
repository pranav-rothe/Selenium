package testNG;

import org.testng.annotations.Test;

public class DependsOnMethods_Keyword_TestAno {
	
	@Test
	public void openApp() {
		System.out.println("openApp");
	}
	
	@Test
	public void userName() {
		System.out.println("username");
	}
}
