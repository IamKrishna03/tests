package aa.bb;

//import this package to driver setup
import io.github.bonigarcia.wdm.WebDriverManager;

// imort this to open chromedriver
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
// import this to use webdriver
import org.openqa.selenium.WebDriver;
// import this to use webelement 
import org.openqa.selenium.WebElement;

public class testselenium {
	
	public static void main(String[] args)  {
		
		// for driver setup
		WebDriverManager.chromedriver().setup();
		
		// open browser
		WebDriver driver = new ChromeDriver();
		
		// now we have driver object and we will work with this to do any activity
		
		driver.get("https://www.google.com/");
		WebElement text = driver.findElement(By.name("q"));
		WebElement searchbt = driver.findElement(By.name("btnK"));
		WebElement flink = driver.findElement(By.linkText("What is Selenium?"));
		
		
		text.click();
		text.sendKeys("do you know selenium ?");
		searchbt.click();
	    flink.click();

	}

}