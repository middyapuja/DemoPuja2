package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//constructor
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
		}
		@FindBy(linkText = "Contacts")
		private WebElement contactsLink;
		
		@FindBy(linkText = "Organizations")
		private WebElement organizationsLink;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement logoutLink;
		
		@FindBy(linkText = "Sign Out")
		private WebElement signoutLink;

		/**
		 * @return the contactsLink
		 */
		public WebElement getContactsLink1() {
			return contactsLink;
		}

		/**
		 * @return the organizationsLink
		 */
		public WebElement getOrganizationsLink() {
			return organizationsLink;
		}

		/**
		 * @return the logoutLink
		 */
		public WebElement getLogoutLink() {
			return logoutLink;
		}

		/**
		 * @return the signoutLink
		 */
		public WebElement getSignoutLink() {
			return signoutLink;
		}

		public WebElement getContactsLink() {
			// TODO Auto-generated method stub
			return null;
		}
		

}
