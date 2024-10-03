package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationCreatePage {

	public OrganizationCreatePage(WebDriver driver) {
	      PageFactory.initElements(driver,this);
	
   }

    @FindBy(name="accountname")
    private WebElement organizationnameTextField;
    
    @FindBy(name="industry")
    private WebElement industryTextField;
    
    @FindBy(name="accounttype")
    private WebElement accountTypeTextField;
    
    @FindBy(name="button")
    private WebElement save;

	/**
	 * @return the organizationinfoLink
	 */
	public WebElement getOrganizationinfoLink() {
		return organizationnameTextField;
	}

	/**
	 * @return the industryTextField
	 */
	public WebElement getIndustryTextField() {
		return industryTextField;
	}

	/**
	 * @return the accountTypeTextField
	 */
	public WebElement getAccountTypeTextField() {
		return accountTypeTextField;
	}

	/**
	 * @return the save
	 */
	public WebElement getSave() {
		return save;
	}

}
