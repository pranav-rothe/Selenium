package groupstestNG;

import org.testng.annotations.Test;

public class GroupBySignup {

	@Test(groups= {"sanity"})
	void test_signupByEmail()
	{
		System.out.println("sign up by email...");
	}

	@Test(groups= {"sanity"})
	void test_signupByFB()
	{
		System.out.println("sign up by FB...");
	}

	@Test(groups= {"sanity"})
	void test_signupByTwitter()
	{
		System.out.println("sign up by Twitter...");
	}
}
