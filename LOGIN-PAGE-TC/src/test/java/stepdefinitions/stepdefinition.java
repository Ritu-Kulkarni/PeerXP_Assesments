package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobjects.initial;
import pageobjects.loginpage;
import resources.Base;

import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepdefinition extends Base {

	@Given("^Intialise the chrome browser$")
	public void intialise_the_chrome_browser() throws Throwable {
		driver = intialiseDriver();
	}

	@When("^Navigation link provided \"([^\"]*)\"$")
	public void navigation_link_provided_something(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@Then("^User enter (.+) and (.+) and logs in$")
	public void user_enter_and_and_logs_in(String username, String password) throws Throwable {
		loginpage lp = new loginpage(driver);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getSign().click();
	}

	@Then("^Verify whether the home page is display if not$")
	public void verify_whether_the_home_page_is_display_if_not() throws Throwable {
		initial vfy = new initial(driver);
		Assert.assertTrue(vfy.getVerify().isDisplayed());
		driver.close();

	}

}
