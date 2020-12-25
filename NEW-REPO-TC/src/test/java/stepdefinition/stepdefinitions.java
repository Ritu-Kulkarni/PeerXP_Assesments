package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.newrepo;
import resources.Base;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@RunWith(Cucumber.class)
public class stepdefinitions extends Base {

	@Given("^Intialize the chrome browser$")
	public void intialize_the_chrome_browser() throws Throwable {
		driver = intialiseDriver();
	}

	@When("^the link provided is \"([^\"]*)\"$")
	public void the_link_provided_is_something(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@When("^loogin credentials are \"([^\"]*)\" and \"([^\"]*)\"$")
	public void loogin_credentials_are_something_and_something(String strArg1, String strArg2) throws Throwable {
		newrepo nr = new newrepo(driver);
		nr.getUsername().sendKeys(strArg1);
		nr.getPassword().sendKeys(strArg2);
		nr.getsignin().click();
	}

	@Then("^Click on the dropdown menu$")
	public void click_on_the_dropdown_menu() throws Throwable {
		newrepo nr = new newrepo(driver);
		nr.getnewrepo().click();
	}

	@Then("^Next,click on the new repository$")
	public void nextclick_on_the_new_repository() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/header/div[6]/details/details-menu/a[1]")).click();

	}

	@And("^Enter the credentials in (.+)$")
    public void enter_the_credentials_in(String names) throws Throwable {
		newrepo nr = new newrepo(driver);
		nr.gettextbox().sendKeys(names);
	}

	@And("^Click on the create repository$")
	public void click_on_the_create_repository() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement obj=driver.findElement(By.cssSelector("#new_repository > div.js-with-permission-fields > button"));
     js.executeScript("arguments[0].scrollIntoView();", obj);
     obj.click();
     driver.close();
    }
		
	}


