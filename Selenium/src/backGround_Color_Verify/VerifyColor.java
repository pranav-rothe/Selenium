package backGround_Color_Verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor {

	public static void main(String[] args) {

		String expectedColor="#f68422";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		WebElement element=driver.findElement(By.xpath("//button[text()='Book a Free Demo']"));
		String Colors=element.getCssValue("background-color");
		
		String actualColor=Color.fromString(Colors).asHex();
		
		if(actualColor.equals(expectedColor)) {
			System.out.println("Color match");
		}
		else {
			System.out.println("Color is not match");
		}
	}

}
