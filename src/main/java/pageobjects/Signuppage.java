package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Signuppage {
	public WebDriver driver;
	public Signuppage(WebDriver ddriver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/svg")
	WebElement emoti;
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/ul/li[2]/a")
	WebElement forsignup;
	@FindBy(xpath="//*[@id=\'spree_user_email\']")
	WebElement emailid;
	@FindBy(xpath="//*[@id=\'spree_user_password\']")
	WebElement password;
	@FindBy(xpath="//*[@id=\'signup_form\']/input[4]")
	WebElement signup;
	
	public WebElement Emoti()
	{
		return emoti;
	}
	public WebElement forsignup_click()
	{
		return forsignup;
	}
	public WebElement Emailid()
	{
		return emailid;
	}
	public WebElement Password()
	{
		return password;
	}
	public WebElement Signup()
	{
		return signup;
	}

}




