package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Myntra 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		WebElement mytra=driver.findElement(By.xpath("//a[contains(@href,'loungewear?plaEnabled=false')]"));
		Thread.sleep(10000);
		mytra.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\mytra1.png");
		FileHandler.copy(src, des);
		
		WebElement girl=driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]"));
		File src1=girl.getScreenshotAs(OutputType.FILE);
		File des1=new File("D:\\#Software Testing\\Selenium\\Screenshot\\girl.png");
		FileHandler.copy(src1, des1);
		
	}

}
