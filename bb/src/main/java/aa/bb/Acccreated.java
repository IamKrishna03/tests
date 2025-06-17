package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Acccreated {
	static WebDriver driver;
	static WebElement ctnbtn;
	static WebElement text;
	Acccreated(WebDriver driver){
		this.driver=driver;
		acccreatedele();
	}
	
	 void verifytitle(String exptitle) {
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(exptitle)) {
			System.out.println("Title matched");
		}else {
			System.out.println("Title not matched");
		}
	}
	
	 void acccreatedele() {
		ctnbtn = driver.findElement(By.className("btn-primary"));
		text = driver.findElement(By.className("text-center"));
	}
	
	 void continuebtn() {
		ctnbtn.click();
		
	}
	
	 void getpagetext() {
		System.out.println(text.getText());
	}
}
