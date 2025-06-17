package aa.bb;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup {
	WebDriver driver;
	static WebElement mrradio;
	static WebElement msradio;
	static WebElement spass;
	static WebElement checkbox3;
	static WebElement checkbox2;
	static WebElement ftname;
	static WebElement ltname;
	static WebElement cname;
	static WebElement add1 ;
	static WebElement add2;
	static WebElement states;
	static WebElement cities;
	static WebElement zipcode;
	static WebElement mobno;
	static WebElement datedrp;
	static WebElement monthdrp;
	static WebElement yeardrp;
	static WebElement countrydrp;
	static WebElement createacc;
	static WebElement ltext;
	static WebElement luser;
	static  WebElement removeButton;
	static  WebElement DD;
	static  WebElement ADD;
	Signup (WebDriver driver){
		this.driver=driver;
		//System.out.println("driver initilized");
		signupelems ();
	}
	


	  void signupelems () {
		 mrradio = driver.findElement(By.id("id_gender1"));
		 msradio = driver.findElement(By.id("id_gender2"));
		 spass  = driver.findElement(By.id("password"));
		 checkbox3 = driver.findElement(By.id("newsletter"));
		 checkbox2 = driver.findElement(By.id("optin"));
		 ftname = driver.findElement(By.id("first_name"));
		 ltname = driver.findElement(By.id("last_name"));
		 cname = driver.findElement(By.id("company"));
		 add1 = driver.findElement(By.id("address1"));
		 add2 = driver.findElement(By.id("address2"));
		 states = driver.findElement(By.id("state"));
		 cities = driver.findElement(By.id("city"));
		 zipcode = driver.findElement(By.id("zipcode"));
		 mobno = driver.findElement(By.id("mobile_number"));
		 datedrp = driver.findElement(By.id("days"));
		 monthdrp = driver.findElement(By.id("months"));
		 yeardrp = driver.findElement(By.id("years"));
		 countrydrp = driver.findElement(By.id("country"));
		 createacc = driver.findElement(By.className("btn-default"));
		// XPath to locate the SVG button containing the cancel icon (adjust based on the exact hierarchy)
		 //removeButton = driver.findElement(By.xpath("//*[name()='svg' and contains(@style, 'dropShadowTop')]"));
		 // removeButton = driver.findElement(By.cssSelector("svg[style*='filter: url(&quot;#dropShadowTop&quot;);']"));
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		// DD = driver.findElement(By.className("grippy-host"));
		 ///html/body/ins[2]/div[1]//ins/span/svg

		 System.out.println("elements executed");
		 
	}
	
	
	  void verifytitle(String expectedtitle) {
		String actualtitle = driver.getTitle();
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("correct title");
		} else {
			System.out.println("invalid title");
		}
	}
	
	  void accountinfo(String pass, String month , String year ,String day )   {
	   System.out.println("accountinfo method");
	   mrradio.click();
	  
		System.out.println("accinfo method2");
		
		spass.click();
		spass.sendKeys(pass);
		Select days = new Select(datedrp);
		days.selectByVisibleText(day);
		Select months = new Select(monthdrp);
		months.selectByVisibleText(month);
		Select years = new Select(yeardrp);
		years.selectByVisibleText(year);
		checkbox3.click();
		checkbox2.click();
		 

	}

	  public void adrsinfo(String fname, String lname, String company, String adress, String adress2 , String country ,String state ,String city , String zip , String mono) {
			
		ftname.click();
		ftname.sendKeys(fname);

		ltname.click();
		ltname.sendKeys(lname);

		cname.click();
		cname.sendKeys(company);

		add1.click();
		add1.sendKeys(adress);

		add2.click();
		add2.sendKeys(adress2);

		Select countriesdrp = new Select(countrydrp);
		countriesdrp.selectByVisibleText(country);
		
		states.click();
		states.sendKeys(state);
		
		cities.click();
		cities.sendKeys(city);
		
		zipcode.click();
		zipcode.sendKeys(zip);
		
		mobno.click();
		mobno.sendKeys(mono);
		
	}
	
	 void Createacc() {
		createacc.click();
	}
	 
	 void dropdown() throws InterruptedException {
		 Thread.sleep(5000);
		 DD = driver.findElement(By.className("grippy-host"));
		 DD.click();
		 System.out.println("aaa");
//		 ((JavascriptExecutor) driver).executeScript(
//				    "document.querySelector('.adsbygoogle').style.display='none';");


	 }

}
