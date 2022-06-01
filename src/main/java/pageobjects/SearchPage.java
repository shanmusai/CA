package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;
	public SearchPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[@id=\'search\']")
	WebElement SearchBar;
	
	@FindBy(xpath="//*[@id=\'search-results\']/div[3]/ul/li[1]/div/div[5]/a/div[1]/span")
	WebElement product;
	
	
	
	public WebElement product_enter()
	{
		return SearchBar;
	}

	public WebElement productvisible()
	{
		return product;
	}
	
	
}
