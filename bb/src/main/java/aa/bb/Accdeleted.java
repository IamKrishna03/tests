package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accdeleted {
	static WebDriver driver;
	static WebElement ctnbtn;
	static WebElement text;
	Accdeleted(WebDriver driver){
		this.driver=driver;
		accdeledele();
	}
	
	static void verifytitle(String exptitle) {
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(exptitle)) {
			System.out.println("Title matched");
		}else {
			System.out.println("Title not matched");
		}
	}
	
	static void accdeledele() {
		ctnbtn = driver.findElement(By.className("btn-primary"));
		text = driver.findElement(By.className("text-center"));
	}
	
	static void continuebtn() {
		ctnbtn.click();
		
	}
	
	static void getpagetext() {
		System.out.println(text.getText());
	}
}
