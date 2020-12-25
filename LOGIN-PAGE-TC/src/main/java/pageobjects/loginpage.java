package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginpage {

	public WebDriver driver;
	
	By username = By.id("login_field");
	By password = By.id("password");
	By signin = By.xpath("//input[@value='Sign in']");

	
	
	
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	@Test
	public WebElement getUsername() {

		return driver.findElement(username);
	}
	@Test
	public WebElement getPassword() {

		return driver.findElement(password);
	}

	@Test
	public WebElement getSign() {

		return driver.findElement(signin);
	}

	
	
	
}
