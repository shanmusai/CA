package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Checkout {

	public WebDriver driver;

	public Cart_Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/tv-units?src=explore_categories']")
	WebElement select;
	@FindBy(xpath="//img[@title='Top 100 Bestsellers Furniture Zephyr Large TV Unit (Teak Finish)']")
	WebElement product;

	@FindBy(xpath="//div[@id='buy_details_44233']//button[@id='add-to-cart-button']")
	WebElement add;

	@FindBy(xpath="//div[@class='large-4 columns btn_wrap']//a[@class='continueshop'][normalize-space()='Continue shopping']")
	WebElement continue_shopping;

	


	@FindBy(xpath="//div[@class='large-4 columns btn_wrap']//button[@id='checkout-link']")
	WebElement checkout;


	
	public WebElement select_item_type() {
		return select;
	}
	

	public WebElement product_selection() {
		return product;
	}
	public WebElement Add_cart() {
		return add;
	}
	public WebElement Continue_shop() {
		return continue_shopping;
	}

	
	public WebElement Go_Checkout() {
		return checkout;
	}
	
}
