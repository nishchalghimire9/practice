
// creating test case for login page.
// while we are creating test case we must extends base class. 
// it only contain actual test case
package BankingTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import bank_pageObject.LoginPage;

public class TC_Login_001 extends BaseClass {     // extending base class in TC_login_001
	
	@Test
	public void loginTest() {
		driver.get(baseurl);   // after this we have create object of login page to connect to login in page class
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank"))
			
		{
			Assert.assertTrue(true);
			
		}
		else {
			
			Assert.assertTrue(false);
		}
	}
	
	
}
