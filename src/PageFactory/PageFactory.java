package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	
	public  WebElement element =null;
	public WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"login\"]/div[2]/p[1]/input")
	WebElement UserName;
	
	@FindBy(xpath ="//*[@id=\"login\"]/div[2]/p[2]/input")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form[1]/div[2]/p[3]/input")
	WebElement SubmitLogin;
	
	
	
	public PageFactory(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	public void Username(String user)
	
	{
		UserName.sendKeys(user);
		System.out.println("inside");
	}

	public void PassWord(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void LoginSubmit()
	{
		SubmitLogin.click();
	}

	

}
