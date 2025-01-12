package testNG;

import org.testng.annotations.Test;

public class DependsOn_Features {

	@Test
	public void pranav() {
		System.out.println("@Test ==> pranav method");
	}

	@Test
	public void aman() {
		System.out.println("@Test ==> aman method");
	}
	
	@Test
	public void jayesh() {
		System.out.println("@Test ==> jayesh method");
	}

	@Test
	public void nishant() {
		System.out.println("@Test ==> nishant method");
	}

	@Test(dependsOnMethods = "pranav")
	public void tejas() {
		System.out.println("@Test ==> tejas method");
	}

	@Test(dependsOnMethods = "nishant")
	public void vivek() {
		System.out.println("@Test ==> vivek method");
	}

	

}
