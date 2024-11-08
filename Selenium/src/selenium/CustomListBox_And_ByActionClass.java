package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CustomListBox_And_ByActionClass {

	//  (//div[@class=' css-1hwfws3'])[3]
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		WebElement w=driver.findElement(By.xpath("(//div[@class=' css-yk16xz-control'])[3]"));
		
		Actions alt=new Actions(driver);
		alt.moveToElement(w).click().perform();
		
		alt.sendKeys(Keys.ENTER);
		alt.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		alt.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		alt.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
}
