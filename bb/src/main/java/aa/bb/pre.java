package aa.bb;

//import this package to driver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// imort this to open chromedriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
// import this to use webdriver
import org.openqa.selenium.WebDriver;
// import this to use webelement 
import org.openqa.selenium.WebElement;

public class pre {
	
	public static void main(String[] args)  {
		
		// for driver setup
		WebDriverManager.chromedriver().setup();
		
		// open browser
		WebDriver driver = new ChromeDriver();
		
		// now we have driver object and we will work with this to do any activity
		
		driver.get("https://www.google.com/");
		 
		WebElement text = driver.findElement(By.name("q"));
		//text.click();
		text.sendKeys("amazon.com");
		driver.findElement(By.name("btnK")).submit();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println(title);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		if(searchbox.isDisplayed() && searchbox.isEnabled()) {
			searchbox.click();
			searchbox.sendKeys("mobile");
			driver.findElement(By.id("nav-search-submit-button")).submit();
		}
		WebDriverWait waiti = new WebDriverWait(driver, Duration.ofSeconds(10));
		String title2 = driver.getTitle();
		System.out.println(title2);
		

		String textt = driver.findElement(By.className("a-color-state a-text-bold")).getText();
		
		System.out.println("searched value" + textt);

	}

}