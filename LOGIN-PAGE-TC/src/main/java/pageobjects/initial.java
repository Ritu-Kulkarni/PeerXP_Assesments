package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class initial {

	public WebDriver driver;

	By verify = By.xpath("/html/body/div[1]/header/div[3]/div/div/form/label/input[1]");

	public initial(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	@Test
	public WebElement getVerify() {

		return driver.findElement(verify);
	}

}
