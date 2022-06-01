package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/svg")
	WebElement emoti;
	
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[1]/a")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'spree_user_email\']")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\'spree_user_password\']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	WebElement signinbutton;
	
	@FindBy(xpath="//*[@id=\'ul_site_login\']")
	WebElement LogoutButton;
	public WebElement Emoti()
	{
		return emoti;
	}
	public WebElement Login_click()
	{
		return login;
	}
	
	public WebElement Email()
	{
		return emailid;
		
	}
	public WebElement Password()
	{
		return password;
		
	}
	
	public WebElement Sign_in()
	{
		return signinbutton;
		
	}
	public WebElement Logout_validate()
	{
		return LogoutButton;
		
	}
}
