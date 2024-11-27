package toolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//div[@class='nDcEnd']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
		String expected_Tip="Search by image";
		
		String actual_Tip=element.getAttribute("aria-label");
		
		if(expected_Tip.equals(actual_Tip)) {
			System.out.println("Correct and match with expected result name");
		}
		else {
			System.out.println("Invalid and not match with expected result name");
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
