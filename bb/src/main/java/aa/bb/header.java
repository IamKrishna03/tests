package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class header {
	 WebDriver driver;
	 WebElement hhome;
	 WebElement hproduct;
	 WebElement hcart;
	 WebElement hsignup;
	 WebElement hcontactus;
	
	header(WebDriver driver){
		this.driver=driver;
		headeropt();
		
	}
	 void headeropt() {
		hhome = driver.findElement(By.className("fa-home"));
		hproduct = driver.findElement(By.className("card_travel"));
		hcart = driver.findElement(By.className("fa-lock"));
		hsignup= driver.findElement(By.className("fa-lock"));
	}
}
