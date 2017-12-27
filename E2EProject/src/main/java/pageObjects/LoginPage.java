package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By inputemail = By.cssSelector("input#user_email");
	By inputpassword = By.id("user_password");
	By loginbutton = By.cssSelector("input[value='Log In'");
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		
	}

	
	public WebElement enterEmail(){
		return driver.findElement(inputemail);
	}
	
	public WebElement enterPW(){
		return driver.findElement(inputpassword);
	}
	
	public WebElement clickLogin(){
		return driver.findElement(loginbutton);
	}
	
}
