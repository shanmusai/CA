package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class trackorder {


	public WebDriver driver;
	
	public trackorder(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\'header\']/section/div/ul[1]/li[2]/a")
	WebElement trackorder;
	
	@FindBy(xpath="//*[@id=\'ip_379403698\']")
	WebElement orderno;
	@FindBy(xpath="//*[@id=\'ip_394711104\']")
	WebElement phoneno;
	@FindBy(xpath="//*[@id=\'app-container\']/div/main/section/form[1]/button")
	WebElement submit;
	public WebElement to()
	{
		return trackorder;
	}
	public WebElement orderno()
	{
		return orderno;
	}
	public WebElement phoneno()
	{
		return phoneno;
	}
	public WebElement submit()
	{
		return submit;
	}
	
}



