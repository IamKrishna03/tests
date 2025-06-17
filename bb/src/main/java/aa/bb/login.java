package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class login {

	WebDriver driver;
	WebElement lemail;
	WebElement lpass;
	WebElement lbtn;
	WebElement ltext;
	WebElement luser;
	WebElement sname;
	WebElement semail;
	WebElement sbutton;
	WebElement error;
	
	 login (WebDriver driver){
		this.driver=driver;
		loginele ();
	}
	
	 void loginele () {
		 lemail = driver.findElement(By.cssSelector("input[data-qa=\"login-email\"]"));
		 lpass = driver.findElement(By.cssSelector("input[data-qa=\"login-password\"]"));
		 lbtn = driver.findElement(By.cssSelector("button[data-qa=\"login-button\"]"));
		 ltext = driver.findElement(By.className("login-form"));
		 sname = driver.findElement(By.cssSelector("input[data-qa=\"signup-name\"]"));
		 semail = driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]"));
		 sbutton = driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));
	}
	
	

	
	
	 void verifytitle(String expectedtitle) {
		String actualtitle = driver.getTitle();
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("correct title");
		} else {
			System.out.println("invalid title");
		}
	}
	
	 void logins(String email ,String pass) {
		
		lemail.sendKeys(email);
		lpass.sendKeys(pass);
		lbtn.click();
		
		
	}

	
	 Signup signups(String name, String Email) {
		
		sname.click();
		sname.sendKeys(name);
		semail.click();
		semail.sendKeys(Email);
		sbutton.click();
		return new Signup (driver);
	}
	
	 void logintxt() {
		System.out.println(ltext.getText());
	}
	
	 void lusername() {
		luser = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b"));
		String t = luser.getText();
		System.out.println(t);
	}
	
	 void logiberror () {
		error = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
		String errors = error.getText();
		System.out.println(errors);
	}
	
}
