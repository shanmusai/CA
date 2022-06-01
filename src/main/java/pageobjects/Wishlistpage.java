package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage {

public WebDriver driver;
	
	public Wishlistpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\'content\']/div[5]/div/div/ul/div/div/li[2]/ul/li[1]/a/img")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\'content\']/div[3]/div/ul/li[1]/div/div[6]/span[2]")
	WebElement Add_wishlist;
	
	@FindBy(xpath="//*[@id=\'content\']/ul/li/div/a/img")
	WebElement wishlist;
	
	
	
	@FindBy(xpath="//a[@class='swym-link']")
	WebElement Product_visibility;
	
	public WebElement Product_click() {
		return product;
	}
	public WebElement Add_wishlist() {
		return Add_wishlist;
	}
	public WebElement Wishlist_click() {
		return wishlist;
	}
	

	public WebElement Product_visibility() {
		return Product_visibility;
	}
}
