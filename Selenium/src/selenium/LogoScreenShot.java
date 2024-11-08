package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LogoScreenShot 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		WebElement ss=driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
		File src=ss.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\logo.jpeg");
		FileHandler.copy(src, des);
//		driver.close();
		
		
	}

}
