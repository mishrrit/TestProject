/**
 * 
 */
package net.marketplace;
import CommonMethods.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author mishrrit
 * this is the main test case class where the validation will happen
 *
 */
public class FP_Portal_LoginPage {
	
	
	@Test
	public void verifyValidLogin() {
	Utils util =new Utils();
	
	
	
	util.BrowserSelection();
	
	try {
		util.Login();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
		
	}
	
	
	
	
	

}
