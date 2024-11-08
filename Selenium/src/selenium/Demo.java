package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
	  //ChromeDriver driver =new ChromeDriver();
//      Actions a=new Actions(driver);
      
     
      
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      Thread.sleep(3000);
      
      driver.switchTo().newWindow(WindowType.TAB);
      driver.navigate().to("https://www.youtube.com/");
      Thread.sleep(2000);
    
//    driver.switchTo().newWindow(WindowType.WINDOW);
//    driver.get("https://www.google.com/");
//    Thread.sleep(2000);  
//    driver.close();
//    Thread.sleep(2000);
//    driver.quit();
      driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Brown Rang");
    
      driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
      
    
      WebElement x= driver.findElement(By.xpath(""));
      driver.switchTo().frame(x);
      driver.findElement(By.xpath("//yt-formatted-string[@aria-label=\"Brown Rang - Yo Yo Honey Singh India's No.1 Video 2012 by Speed Punjabi 335,884,172 views 12 years ago 2 minutes, 59 seconds\"]")).click();//     System.out.println("OK");
//    
//     WebElement w=driver.findElement(By.xpath("//a[@title='Ve Haaniyaan - Official Video | Ravi Dubey & Sargun Mehta | Danny | Avvy Sra | Dreamiyata Music']"));
//     a.moveToElement(w).doubleClick();
   //  w.click();
    
      
	}

}
