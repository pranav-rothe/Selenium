package groupstestNG;

import org.testng.annotations.Test;

public class GroupByLogin {

	@Test(groups= {"regression"})
	void test_loginByEmail()
	{
		System.out.println("login by email...");
	}

	@Test(groups= {"regression"})
	void test_loginByFB()
	{
		System.out.println("login by FB...");
	}

	@Test(groups= {"regression"})
	void test_loginByTwitter()
	{
		System.out.println("login by Twitter...");
	}

}
