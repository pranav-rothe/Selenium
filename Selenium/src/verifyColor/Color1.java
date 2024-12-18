package verifyColor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color1 {

	public static void main(String[] args) {

		String expected_color="#0866ff";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement w=driver.findElement(By.xpath("//button[@name='login']"));
		String bcolor=w.getCssValue("background-color");
		
		String actual_color=Color.fromString(bcolor).asHex();
		
		if(expected_color.equals(actual_color)) {
			System.out.println("Color is match");
		}
		else {
			System.out.println("Other color");
		}
		
	}

}
