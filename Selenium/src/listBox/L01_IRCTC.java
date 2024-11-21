package listBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L01_IRCTC {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("(//div[contains(@class, 'ui-state-default')])[1]")).click();
		
		List<WebElement> l=driver.findElements(By.xpath("//div[contains(@class, 'ng-tns-c65-11')]/ul/p-dropdownitem/li/span"));
		
		String exp="Vistadome Non AC (VS)";
		for(WebElement x:l) {
			String s=x.getText();
			System.out.println(s);
			
			if(s.equals(exp)) {
				x.click();
				break;
			}
			System.out.println("Pass and match");
		}
		
		

	}

}
