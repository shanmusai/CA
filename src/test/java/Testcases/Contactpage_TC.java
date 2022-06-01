package Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjects.Contactpage;
import utilities.BaseTest;

public class Contactpage_TC extends BaseTest{
	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void ContactPage() throws InterruptedException
	{
		Contactpage cp=new Contactpage(driver);
		driver.get(baseURL);
		
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		
	}
}
