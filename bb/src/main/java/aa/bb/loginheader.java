package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginheader {
	static WebDriver driver;
	static WebElement delete;
	static WebElement logout;
	
	loginheader(WebDriver driver){
		this.driver=driver;
		headropt();
	}
	
	 void headropt() {
		delete = driver.findElement(By.className("fa-trash-o"));
		logout = driver.findElement(By.className("fa-lock"));
	}
	
	 void deleted() {
		delete.click();
	}
	
	 static void logout() {
		logout.click();
	}
}
