package Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjects.Signuppage;
import utilities.BaseTest;
import utilities.ReadConfig;
public class Signuppage_TC  extends BaseTest {
	ReadConfig readconfig = new ReadConfig();
	public String excellocation=readconfig.Excel();
	public static Logger log = LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void signuppage() throws IOException, InterruptedException
	{
		Signuppage sp = new Signuppage(driver);
		driver.get(baseURL);
		sp.forsignup_click().click();
		log.info("Login Page loaded successfully");
		test.info("Login in page loaded succesffuly");
		File scr1 = new File(excellocation);
		FileInputStream fis1 = new FileInputStream(scr1);
		XSSFWorkbook workbook = new XSSFWorkbook(fis1);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rows = sheet.iterator();
		Row firstRow = rows.next();
		Row secondRow = rows.next();
		
		Iterator<Cell> cel = firstRow.cellIterator();
		cel.next();
		String email = cel.next().getStringCellValue();
		Iterator<Cell> ce2 = secondRow.cellIterator();
		ce2.next();
		String password = ce2.next().getStringCellValue();
		sp.Emailid().sendKeys(email);
		log.info("Email entered successfully");
		test.info("Email enterd successfully");
		sp.Password().sendKeys(password);
		log.info("Password entered successfully");
		sp.Signup().click();
		Thread.sleep(2000);
		
	}
}





