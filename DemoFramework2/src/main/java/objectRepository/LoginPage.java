package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//constructor
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		@FindBy(name="user_name")
		private WebElement username;
		
		@FindBys({@FindBy(name="user_password"),@FindBy(xpath="//input[@type='password']")})
		private WebElement password;
		
		@FindBy(id="submitButton")
		private WebElement loginbutton;

		/**
		 * @return the username
		 */
		public WebElement getUsername() {
			return username;
		}

		/**
		 * @return the password
		 */
		public WebElement getPassword() {
			return password;
		}

		/**
		 * @return the loginbutton
		 */
		public WebElement getLoginbutton() {
			return loginbutton;
		}

}
