package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.xpath("//span[contains(.,'Login')]");
	By contactus = By.xpath("//a[contains(text(),'Contact us')]");
	By womensTagNavbar = By.xpath("//a[contains(text(),'Women')]");
	public LandingPage(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getLogin(){
		return driver.findElement(signin);
	}
	
	public WebElement getContactUs(){
		return driver.findElement(contactus);
	}

	public void verifyWomensOption(){
		
		 Actions builder = new Actions(driver);
		 WebElement element = driver.findElement(womensTagNavbar);
		 builder.moveToElement(element).build().perform();
		 
		
	}
}
