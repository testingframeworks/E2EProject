package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	/*
	@Test
	
	public void basePageNavigation() throws IOException
	{
	   driver = initializeDriver();
	   driver.get("http://www.qaclickacademy.com/");
	   driver.manage().window().maximize();
	   LandingPage l = new LandingPage(driver);
	   l.getLogin().click();
	   
	   LoginPage lp = new LoginPage(driver);
	   lp.enterEmail().sendKeys("test@gmail.com");
	   lp.enterPW().sendKeys("password");
	   lp.clickLogin().click();
	   
	   
	}
	*/
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize () throws IOException{
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get("http://automationpractice.com/index.php");
		log.info("Navigated successfully to the Homepage");
		driver.manage().window().maximize();
		
	}
	@Test
	public void basePageNavigation() throws IOException
	{
	   
	   LandingPage l = new LandingPage(driver);
	   l.verifyWomensOption();
	   log.info("The Overlay opened successfully");
	   log.info("The overlay opened success");
	   
	   
	}

}
