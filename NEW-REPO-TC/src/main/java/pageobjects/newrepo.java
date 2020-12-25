package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class newrepo {

	public WebDriver driver;

	By dropdown = By.cssSelector(
			"body > div.position-relative.js-header-wrapper > header > div:nth-child(6) > details > summary");
	By box = By.id("repository_name");
	By name = By.id("login_field");
	By pass = By.id("password");
	By signin = By.xpath("//input[@value='Sign in']");

	public newrepo(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	@Test
	public WebElement getnewrepo() {

		return driver.findElement(dropdown);

	}

	@Test
	public WebElement gettextbox() {

		return driver.findElement(box);

	}

	@Test
	public WebElement getUsername() {

		return driver.findElement(name);
	}

	@Test
	public WebElement getPassword() {

		return driver.findElement(pass);
	}

	@Test
	public WebElement getsignin() {

		return driver.findElement(signin);
	}

}
