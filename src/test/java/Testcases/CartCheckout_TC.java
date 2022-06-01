package Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjects.Cart_Checkout;
import utilities.BaseTest;

public class CartCheckout_TC extends BaseTest{

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());

	@Test
	public void cartcheckout() throws IOException, InterruptedException
	{
		driver.get(baseURL);
		Cart_Checkout cart=new Cart_Checkout(driver);
		cart.select_item_type().click();
		log.info("product itesm are displayed");
		test.info("product items are displayed");
		cart.product_selection().click();
		log.info("selecr the which item to buy");
		test.info("select whcih item to buy");
		cart.Add_cart().click();
		log.info("Product in cart displayed");
		test.info("Product in cart displayed");
		cart.Continue_shop().click();
		log.info("continue the shopping");
		test.info("continue the shopping");
		
		cart.Go_Checkout().click();
		
		log.info("successfully navigated to the checkout page");
		test.info("successfully navigated to the checkout page");
	}
}
 