package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;



public class BaseClass {
	
	PropertyFileUtility putil=new PropertyFileUtility();
	ExcelFileUtility eutil=new ExcelFileUtility();
	WebdriverUtility wutil=new WebdriverUtility();
	public WebDriver driver=null;
   public  static WebDriver  sDriver;
  
	
	@BeforeSuite(groups={"Smoke", "Regression"})
	public void bsConfig() {
		System.out.println("..........database Connection established......");
	}
	@org.testng.annotations.Parameters("browser") //for cross browser testing 
	//@BeforeTest // cross browser testing
	
	@BeforeClass(groups={"smoke","Regression"})
	public void bcConfig(/*String BROWSER*/) throws IOException {
		String BROWSER = putil.toReadDataFromPropertyfile("browser");
		String URL = putil.toReadDataFromPropertyfile("url");
		
		
		if(BROWSER.equals("chrome")) {
			driver =new ChromeDriver();	
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		sDriver= driver;
		wutil.toMaximize(driver);
		wutil.waitforElement(driver);
		 driver.get(URL); 
	    }
		@BeforeMethod(groups={"smoke","Regression"})
		public void bmconfig() throws IOException {
		String USERNAME = putil.toReadDataFromPropertyfile("username");
		String PASSWORD = putil.toReadDataFromPropertyfile("password");
        
        LoginPage lp=new LoginPage(driver);
        lp.getUsername().sendKeys(USERNAME);
        lp.getPassword().sendKeys(PASSWORD);
        lp.getLoginbutton().click();
		}
		
		@AfterMethod(groups={"smoke","Regression"})
		public void amconfig() {
			
			HomePage hp=new HomePage(driver);
			wutil.toMouseHover(driver,hp.getLogoutLink());
			hp.getSignoutLink().click();
			
		}
		
		@AfterClass(groups={"smoke","Regression"})
		public void bcconfig() {
			driver.quit();
		}

}
