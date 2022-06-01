package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverAction {

public WebDriver driver;
	
	public HoverAction(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\'topnav_wrapper\']/ul/li[2]/span")
	WebElement hoverelement;
	
	@FindBy(xpath="//*[@id=\'topnav_wrapper\']/ul/li[2]/div/div/ul/li[4]/ul/li[1]/a/span")
	WebElement selectItem;
	
	@FindBy(xpath="//*[@id=\'content\']/div[3]/div/ul/li[1]/div/div[5]/a/div[1]/span")
	WebElement subpage_visiblity;
	
	public WebElement Hover_select() {
		return hoverelement;
	}

	public WebElement Select_Item() {
		return selectItem;
	}
	
	public WebElement Page_Loaded() {
		return subpage_visiblity;
	}
	
}
