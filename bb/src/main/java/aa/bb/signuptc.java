package aa.bb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signuptc {
	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("document.querySelector('selector-for-ad').style.display='none';");



	static public void base() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}
	
	 static void first () throws InterruptedException   {
		base();
		System.out.println("done0");
		header hdr = new header (driver);
		hdr.hsignup.click();
		login lins = new login (driver);
		Signup sup = lins.signups("kke", "kk818@gmail.com");
		System.out.println("done");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		sup.dropdown();
		System.out.println("done");
		sup.accountinfo("password", "March", "2001", "5");
		sup.adrsinfo("test", "test","com", "adress1", "adress2", "United States", "state", "city", "zip","4521025");
		sup.Createacc();
		Acccreated crtd = new Acccreated(driver);
		crtd.verifytitle("Automation Exercise - Account Created");
		crtd.getpagetext();
		crtd.continuebtn();
		loginheader delete = new loginheader(driver);
		delete.deleted();
		Accdeleted.verifytitle("Automation Exercise - Account Deleted");
		Accdeleted.getpagetext();
		Accdeleted.continuebtn();
		
	}
	
	 void second () throws InterruptedException   {
		base();
		header hdr = new header(driver);
		hdr.hsignup.click();
		login lin = new login(driver);
		Signup sup = lin.signups("kok", "kk150@gmail.com");
		System.out.println("done");
		if ((sup != null)) {
		sup.accountinfo("password", "March", "2001", "5"); 
		sup.adrsinfo("test", "test","com", "adress1", "adress2", "United States", "state", "city", "zip","4521025");
		sup.Createacc();
		}else {
			System.out.println("sup null");
		}
		Acccreated crtd = new Acccreated(driver);
		crtd.continuebtn();
		//logout
		loginheader lhdr = new loginheader(driver);
		lhdr.logout.click();
		//for login
		driver.get("https://automationexercise.com/");
		lin.verifytitle("text");
		header hdro = new header(driver);
		hdro.hsignup.click();
		lin.loginele();
		lin.logintxt();
		//lin.login("kk150@gmail.com", "password");
		lin.lusername();
		loginheader delete = new loginheader(driver);
		delete.deleted();
		Accdeleted detd = new Accdeleted(driver);
		detd.getpagetext();
	}
	 void third()   {
		base();
		header hdr = new header(driver);
		hdr.hsignup.click();
		login lin = new login(driver);
		Signup sup = lin.signups("kkk", "kk52@gmail.com");
		System.out.println("done");
		if ((sup != null)) {
		sup.accountinfo("password", "March", "2001", "5"); 
		sup.adrsinfo("test", "test","com", "adress1", "adress2", "United States", "state", "city", "zip","4521025");
		sup.Createacc();
		}else {
			System.out.println("sup null");
		}
		Acccreated crtd = new Acccreated(driver);
		crtd.continuebtn();
		//logout
		loginheader lhdr = new loginheader(driver);
		lhdr.logout.click();
		//for login
		driver.get("https://automationexercise.com/");
		lin.verifytitle("text");
		header hdro = new header(driver);
		hdro.hsignup.click();
		lin.loginele();
		lin.logintxt();
		//lin.login("kk53@gmail.com", "password");
		lin.logiberror();
	}
	
	static void four ()   {
		//signup
		base();
		header hdr = new header(driver);
		hdr.hsignup.click();
		login lin = new login(driver);
		Signup sup = lin.signups("kkk", "kk053@gmail.com");
		System.out.println("done");
		if ((sup != null)) {
		sup.accountinfo("password", "March", "2001", "5"); 
		sup.adrsinfo("test", "test","com", "adress1", "adress2", "United States", "state", "city", "zip","4521025");
		sup.Createacc();
		}else {
			System.out.println("sup null");
		}
		Acccreated crtd = new Acccreated(driver);
		crtd.continuebtn();
		lin.lusername();
		//logout
		loginheader lhdr = new loginheader(driver);
		lhdr.logout.click();
		//verifypage
		lin.verifytitle("Automation Exercise - Signup / Login");
	}
	
     void five ()   {
        base();
 		System.out.println("done0");
 		header hdr = new header (driver);
 		hdr.hsignup.click();
 		login lins = new login (driver);
 		Signup sup = lins.signups("kke", "kk318@gmail.com");
 		System.out.println("done");
 		Signup sups = new Signup (driver);
 		System.out.println("done3");
 		sups.accountinfo("password", "March", "2001", "5"); 
 		sups.adrsinfo("test", "test","com", "adress1", "adress2", "United States", "state", "city", "zip","4521025");
 		sups.Createacc();
 		Acccreated crtd = new Acccreated(driver);
 		crtd.verifytitle("Automation Exercise - Account Created");
 		crtd.getpagetext();
 		crtd.continuebtn();
 		loginheader lheader = new loginheader(driver);
 		lheader.logout();
    	
    }
	public static void main(String[] args) throws InterruptedException  {
		signuptc tc = new signuptc ();
		//signuptc.first ();
		first();
		//tc.five ();
		//second ();
		//third ();
		//four();
		//five ();
	}

}


