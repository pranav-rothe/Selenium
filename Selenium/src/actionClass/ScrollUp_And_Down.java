package actionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollUp_And_Down {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();

//		WebElement w=driver.findElement(By.xpath("//a[text()='Careers']"));

		Actions alt=new Actions(driver);
//		alt.scrollToElement(w).perform();
		
		alt.scrollByAmount(0, 400).perform(); //down scroll
		Thread.sleep(1000);
		alt.scrollByAmount(0, -400).perform(); //up scroll
		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0, 400)");
	}

}
