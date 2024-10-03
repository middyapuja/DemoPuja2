package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage {
	
	public CreateNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(name="lastname")
	private WebElement lastnameLink;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement orgloopupimg;
	
	

	@FindBy(name="button")
	private WebElement saveButton;

	/**
	 * @return the lastnameLink
	 */
	public WebElement getLastnameLink() {
		return lastnameLink;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return saveButton;
	}

	/**
	 * @return the orgloopupimg
	 */
	public WebElement getOrgloopupimg() {
		return orgloopupimg;
	}

}
