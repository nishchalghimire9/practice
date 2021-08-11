

/* this is webelement for login in page   
 */

package bank_pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver ;   // first we need webdriver local webdriver
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
		
	@FindBy(name="Password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	// Action method what needs to be perform
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
			
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
			
	}
	public void clickSubmit() {
		btnLogin.click();
			
	}
	
}
