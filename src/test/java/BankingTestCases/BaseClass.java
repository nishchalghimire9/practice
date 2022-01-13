

// this is base class which is required in every test.

package BankingTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseurl="http://demo.guru99.com/v3/index.php";
	public String username="mngr344746";
	public String password="usAqAda";
	public static WebDriver driver;

	
	@BeforeClass
	public void setup() {  //this is set up for chrome driver as a driver; we can change this driver as needed to different one
	//	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Nishchal\\eclipse-workspace\\BankingProject\\Driver"); 
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@AfterClass
	public void tearDown() {  // this method exit from application after test is execute.
	driver.quit();	
		
	}
	
	
	
	
}

	
	
	