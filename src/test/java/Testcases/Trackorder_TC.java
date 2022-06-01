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

import pageobjects.trackorder;
import utilities.BaseTest;
import utilities.ReadConfig;

public class Trackorder_TC  extends BaseTest{
	ReadConfig readconfig=new ReadConfig();
	//Properties prop;
	public String excellocation=readconfig.Excel();

	public static Logger log= LogManager.getLogger(BaseTest.class.getName());
	@Test
	public void trackorder() throws IOException, InterruptedException
	{	
		trackorder tr=new trackorder(driver);
		driver.get(baseURL);
		tr.to().click();
		log.info("track order pageloaded successfully");
		test.info("track order Page loaded successfully");
		
	}
}




