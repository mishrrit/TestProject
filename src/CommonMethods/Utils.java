package CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.PageFactory;

public class Utils {
	PageFactory page;
	WebDriver driver;
	
	public void  Login() throws InterruptedException {
		System.out.println(" User will enter the user name");
		page.Username("abc");
		
		System.out.println(" User will enter the password");
		page.PassWord("Password");
		
		System.out.println("user will click on the submit button");
		page.LoginSubmit();
		
		boolean Login = driver.getCurrentUrl().equalsIgnoreCase("https://marketplace-iqa.vz.altidev.net/fp-portal/#/app/offers");
		if (Login==true) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Login Un-Successfull");
		}
		
	}
	
	public void BrowserSelection() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser is maximized ");
		driver.get("https://marketplace-iqa.vz.altidev.net/fp-portal/");
		
		
	}
	
	

}
