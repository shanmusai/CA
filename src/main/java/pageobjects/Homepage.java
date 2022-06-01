package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepage {

		public WebDriver driver;
		
		public Homepage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//footer//span[contains(text(),'Powder')]
		@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[1]/a/figure/svg[1]")
		WebElement Logo;
		
	
		public WebElement Homepage_logo()
		{
			return Logo;
		}

}

