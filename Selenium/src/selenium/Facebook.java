package selenium;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		//URL of Facebook page
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on sign up button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sample");
		Thread.sleep(1000);
		//		List<WebElement> l1=driver.findElements(By.xpath("//select[@id='day']/option"));
		//		String expected="29";
		//		for(WebElement x:l1) {
		//			String s=x.getText();
		//			System.out.println(s);
		//			if(expected.equals(s)) {
		//				x.click();
		//			}
		//		}	

		//Performing a days list section
		WebElement days=driver.findElement(By.xpath("//select[@id='day']"));
		Actions alt=new Actions(driver);
		Thread.sleep(1000);
		alt.moveToElement(days).click().sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		//days.sendKeys("15");
		for(int i=1;i<=14;i++) {
			alt.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(500);
		}

		//Performing a month list section
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		alt.moveToElement(month).click().sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		month.sendKeys("April");

		//Performing a year list section
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		alt.moveToElement(year).click().sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		year.sendKeys("1991");

		//select a radio button
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();

		Thread.sleep(1000);
		//entering a email or mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@gmail.com");

		Thread.sleep(1000);
		//entering a password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@1234");

		Thread.sleep(3000);
		//quitting the web-browser
		driver.quit();
	}

}
