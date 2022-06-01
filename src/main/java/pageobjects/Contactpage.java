package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage{
	public WebDriver driver;
	
	public Contactpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\'header\']/section/div/ul[1]/li[1]/a")
	WebElement help;
	@FindBy(xpath="//*[@id=\'content\']/div[2]/div[1]/ul/li[10]/a")
	WebElement contactus;
	
	
	public WebElement Contact_us() {
		return help;
	}	
	public WebElement Name() {
		return contactus;
	}
	
}
