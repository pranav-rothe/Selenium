package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip3 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();

		WebElement w=driver.findElement(By.xpath("//a[text()='Careers']"));

		Actions act=new Actions(driver);
		act.moveToElement(w);
		String expected="Make your next career move to our brilliant company.";
		String actual=w.getAttribute("title");
		System.out.println(actual);
		if(expected.equals(actual)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
