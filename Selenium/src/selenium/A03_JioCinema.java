package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A03_JioCinema {
	public static void main(String[] args) {
		

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		try {
			// Open JioCinema website
			driver.get("https://www.jiocinema.com/search");

			// Maximize the browser window
			driver.manage().window().maximize();

			// Locate the search box
			WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Movies, Shows and more']")); // Update locator as needed
			searchBox.sendKeys("Dune"); // Type "Dune" into the search box

			// Wait for autosuggestions to load
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
			List<WebElement> suggestions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
					By.cssSelector(".suggestion-class") // Replace with actual CSS selector for suggestions
					));

			// Print and interact with suggestions
			System.out.println("Autosuggestions for 'Dune':");
			for (WebElement suggestion : suggestions) {
				System.out.println(suggestion.getText()); // Print each suggestion
			}

			// Click the first suggestion if available
			if (!suggestions.isEmpty()) {
				suggestions.get(0).click();
				System.out.println("Clicked on the first suggestion.");
			} else {
				System.out.println("No suggestions found.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}