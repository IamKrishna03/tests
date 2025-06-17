package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// for driver setup
				WebDriverManager.chromedriver().setup();
				
				// open browser
				WebDriver driver = new ChromeDriver();
				
				// now we have driver object and we will work with this to do any activity
				
				driver.get("https://www.google.com");
				 
				WebElement text = driver.findElement(By.name("q"));
				text.sendKeys("amazon.in");
				driver.findElement(By.name("btnK")).submit();
				WebElement amazon = driver.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[2]/span[1]/span[2]/span[2]/span"));
				amazon.click();
				String title = driver.getTitle();
				System.out.println(title);
				WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
				if(searchbox.isDisplayed() && searchbox.isEnabled()) {
					searchbox.click();
					searchbox.sendKeys("mobile");
					driver.findElement(By.id("nav-search-submit-button")).submit();
				}
			
				String title2 = driver.getTitle();
				System.out.println(title2);
				

				WebElement result = driver.findElement(By.className("a-color-state"));
				String textt = result.getText();
				System.out.println("searched value" + textt);
				
				WebElement cbox = driver.findElement(By.className("a-icon-checkbox"));
				cbox.click();
				Thread.sleep(2000); 
				WebElement cnbox = driver.findElement(By.className("a-icon-checkbox"));
				System.out.println(cnbox.isSelected());
				 

	}

}
