package aa.bb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class prec {
	static WebDriver driver;

	void base(String bname) {
		if (bname.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.get("http://automationexercise.com");
	}

	void verifytitle(String expectedtitle) {
		String actualtitle = driver.getTitle();
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("correct title");
		} else {
			System.out.println("invalid");
		}
	}

	void signuppage() {
		WebElement signup = driver.findElement(By.linkText("Signup / Login"));
		signup.click();
	}

	void signup(String name, String Email) {
		WebElement signup = driver.findElement(By.cssSelector("input[data-qa=\"signup-name\"]"));
		signup.click();
		signup.sendKeys(name);
		WebElement signupe = driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]"));
		signupe.click();
		signupe.sendKeys(Email);
		WebElement signupbtn = driver.findElement(By.cssSelector("button[data-qa=\"signup-button\"]"));
		signupbtn.click();

	}

	void accountinfo(String title, String pass) {
		WebElement text = driver.findElement(By.cssSelector("b"));
		System.out.println(text.getText());

		if (title.equals("mr")) {
			driver.findElement(By.id("id_gender1")).click();
		} else {
			driver.findElement(By.id("id_gender2")).click();
		}

		WebElement passw = driver.findElement(By.id("password"));
		passw.click();
		passw.sendKeys(pass);

		
		  driver.findElement(By.cssSelector("label[for=\"newsletter\"]")).click();
		  driver.findElement(By.cssSelector("label[for=\"optin\"]")).click();
		 

	}

	void adrsinfo(String fname, String lname, String company, String adress, String adress2 , String state ,String city , String zip , String mono) {

		WebElement ftname = driver.findElement(By.id("first_name"));
		ftname.click();
		ftname.sendKeys(fname);

		WebElement ltname = driver.findElement(By.id("last_name"));
		ltname.click();
		ltname.sendKeys(lname);

		WebElement cname = driver.findElement(By.id("company"));
		cname.click();
		cname.sendKeys(company);

		WebElement add1 = driver.findElement(By.id("address1"));
		add1.click();
		add1.sendKeys(adress);

		WebElement add2 = driver.findElement(By.id("address2"));
		add2.click();
		add2.sendKeys(adress2);
		
		WebElement states = driver.findElement(By.id("state"));
		states.click();
		states.sendKeys(state);
		
		WebElement cities = driver.findElement(By.id("city"));
		cities.click();
		cities.sendKeys(city);
		
		WebElement zipcode = driver.findElement(By.id("zipcode"));
		zipcode.click();
		zipcode.sendKeys(zip);
		
		WebElement mobno = driver.findElement(By.id("mobile_number"));
		mobno.click();
		mobno.sendKeys(mono);
		
	}
	
	void createacc() {
		driver.findElement(By.className("btn-default")).submit();
	}
	
	void acccreateed() {
		String actualtitle = driver.getTitle();
		String expectedtitle = "Automation Exercise - Account Created";
		if (actualtitle.equals(expectedtitle)) {
			System.out.println(driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText());
		}else {
			System.out.println("not a valid page for account conformation");
		}
	}
	
	void login() {
		driver.findElement(By.className("btn-primary")).click();
		System.out.println(driver.findElement(By.className("fa-user")).getText());
	}
	
	void deleteacc() {
		driver.findElement(By.className("fa-trash-o")).click();
		System.out.println(driver.findElement(By.className("text-center")).getText());
		driver.findElement(By.className("btn-primary")).click();
	}
	public static void main(String[] args) {
		prec prec = new prec();
		// TODO Auto-generated method stub
		
		//test case 1
		prec.base("chrome");
		prec.verifytitle("test");
		prec.signuppage();
		String text = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
		System.out.println(text);
		prec.signup("testii", "test034@gmail.com");
		prec.accountinfo("mr", "12password");
		prec.adrsinfo("test", "last", "company", "add1", "add2", "state", "city", "zip", "545");
		prec.createacc();
		prec.acccreateed();
		prec.login();
		prec.deleteacc();
	}

}
