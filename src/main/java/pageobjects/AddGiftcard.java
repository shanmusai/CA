package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddGiftcard{

	public WebDriver driver;

	public AddGiftcard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@id=\'header\']/section/div/ul[2]/li[3]/a")
	WebElement gift_card;

	@FindBy(xpath="//li[1]//div[1]//div[1]//button[1]")
	WebElement add;

	


	public WebElement Gift_card_section() {
		return gift_card;
	}
	public WebElement Add_cart() {
		return add;
	}
	
}
