package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactLink;

	/**
	 * @return the createContactLink
	 */
	public WebElement getCreateContactLink11() {
		return createContactLink;
	}

	public WebElement getCreateContactLink() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getCreateContactLink1() {
		// TODO Auto-generated method stub
		return null;
	}

}
