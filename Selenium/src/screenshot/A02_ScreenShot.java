package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A02_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();

		TakesScreenshot ts=(TakesScreenshot)driver;

		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\#Software Testing\\Selenium\\Screenshot\\netflix.png");

		FileHandler.copy(src, des);

		Thread.sleep(2000);
		driver.quit();


	}

}
