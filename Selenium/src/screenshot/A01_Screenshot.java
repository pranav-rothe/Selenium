package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A01_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();  //Step 1: create a WebDriver interface
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();  //Step 2: maximize windows
		
		TakesScreenshot ts=(TakesScreenshot)driver; //Step 3: create a screenshot interface and downcast it
		
		File src=ts.getScreenshotAs(OutputType.FILE); //Step 4: Take a File class to get screenshot and stored it in source variable
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\amazon.png"); //Step 5: Take a File class to stored a screenshot in PC
		
		FileHandler.copy(src, des);
		
		Thread.sleep(2000);		
		driver.quit();
	}

}
