package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {
	
	/**
	 * This method is used to maximize the browser
	 * @param driver
	 */
	public void toMaximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to minimize the browser
	 * @param driver
	 */
	public void toMinimize(WebDriver driver) {
		driver.manage().window().minimize();
	}
	
    /**
     * This method will wait until webElements are loaded(implicit wait)
     * @param driver
     */
	public void waitforElement(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	/**
	 * This method will wait until the element is clickable
	 * @param driver
	 * @param element
	 */
	public void elementTObeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/**
	 * This method will wait until the element is visible
	 * @param driver
	 * @param element
	 */
	public void elementTobeVisible(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method is used to handle dropdown using index 
	 * @param element
	 * @param index
	 */
	public void toHandleDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * This method is used to handle dropdown using value
	 * @param element
	 * @param value
	 */
	public void toHandleDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	/**
	 * This method is used to handle dropdown using visible Text
	 * @param text
	 * @param element
	 */
	public void toHandleDropDown(String text,WebElement element ) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	/**
	 * This method used to handle frame using index
	 * @param driver
	 * @param index
	 */
	public void toHandleFrames(WebDriver driver,int index ) {
		driver.switchTo().frame(index);
		
	}
	/**
	 * This method used to handle frame using id and name
	 * @param driver
	 * @param id_name
	 */
	public void toHandleFrames(WebDriver driver,String id_name) {
		driver.switchTo().frame(id_name);
	
	}
	/**
	 * This method used to handle frame using webElement
	 * @param driver
	 * @param element
	 */
	public void toHandleFrames(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method is used to switch back from the frame
	 * @param driver
	 */
	
	public void toSwithBack(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method is used to double click on the webElement
	 * @param driver
	 * @param element
	 */
	public void toDoubleClick(WebDriver driver, WebElement element) {
      Actions action = new Actions(driver);
     action.doubleClick(element).perform();
		
	}
	
	/**
	 * This is method is used to Right click the webElement
	 * @param driver
	 * @param element
	 */
	public void toRightClick(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/**
	 * This method is used to mouse hover on the webElement
	 * @param driver
	 * @param element
	 */
	public void toMouseHover(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	/**
	 *This method is used to drag and drop on the webElement
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void toDragAndDrop(WebDriver driver, WebElement src, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src,target).perform();
		}
	
	/**
	 * This method is used to handle alert popup by accepting it
	 * @param driver
	 */
	public void toHandleAlertPopupByAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
		
	}
	
	/**
	 * This method is used to handle alert popup by dismissing it
	 * @param driver
	 */
	public void toHandlePopupByDimiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();	
		}
	
	/**
	 * This method is used to handle alert popup and capture alertmsg
	 * @param driver
	 * @return
	 */
	
	public String toHandlePopupAndCaptureText(WebDriver driver) {
		Alert alert=driver.switchTo().alert();
		String alertmsg = alert.getText();
		alert.accept();
		return alertmsg;
	}
	
	/**
	 * This method is used to take screenshot provided with screenshotname
	 * @param driver
	 * @param screenshotname
	 * @throws IOException
	 */
	public void toTakeScreenshot(WebDriver driver, String screenshotname) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShots/"+ screenshotname +".jpeg");
		org.openqa.selenium.io.FileHandler.copy(temp, src);
	}
	
	/**
	 * This method is used to switch the driver control by giving partial title
	 * @param driver
	 * @param partialTitle
	 */
	
	public void toSwitchWindow(WebDriver driver, String partialTitle) {
		Set<String> allwindowIDs = driver.getWindowHandles();
		for(String id: allwindowIDs) {
			String title = driver.switchTo().window(id).getTitle();
			if(title.contains(partialTitle)) {
				break;
			}
			
		}
	}

	public void toHandleDropDown(String text, String industryname) {
		// TODO Auto-generated method stub
		
	}
	

}
