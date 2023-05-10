package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.Homepage;
import page.IncorrectMessagePage;

public class HomeSteps {
    WebDriver driver = StepBase.driver;
    Homepage homepage = new Homepage(driver);
    IncorrectMessagePage incorrectmessagepage;
    @Given("I am in homepage {string}")
    public void i_am_in_homepage(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(string);
    }
    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        homepage.typeCredential(username, password);
    }
    @When("click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnLoginBtn();
    }
    @Then("I am in Incorrect Message Page, the {string} will be exist")
    public void i_am_in_incorrect_message_page_the_will_be_exist(String expected) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        incorrectmessagepage = new IncorrectMessagePage(driver);
        // String expected = "The password you’ve entered is incorrect. Forgot
        // Password?";
        String actual = incorrectmessagepage.getInvalidMessage();
        Assert.assertEquals(actual, expected);
    }
    }

//    WebDriver driver = StepBase.driver;
//    HomePage homepage = new HomePage(driver);
//    IncorrectMessagePage incorrectmessagepage;
//
//    @Given("^I am in home page \"([^\"]*)\"$")
//    public void i_am_in_home_page(String URL) throws Throwable {
//        // driver.navigate().to(URL);
//        driver.get(URL);
//    }
//
//    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void i_enter_and(String username, String password) throws Throwable {
//        homepage.typeCredential(username, password);
//    }
//
//    @When("^click on login button$")
//    public void click_on_login_button() throws Throwable {
//        homepage.clickOnLoginBtn();
//    }
//
//    @Then("I am in  Incorrct Message Page, the {string} will be exsist.")
//    public void i_am_in_incorrct_message_page_the_will_be_exsist(String expected) throws InterruptedException {
//
//        incorrectmessagepage = new IncorrectMessagePage(driver);
//        // String expected = "The password you’ve entered is incorrect. Forgot
//        // Password?";
//        String actual = incorrectmessagepage.getInvalidMessage();
//        Assert.assertEquals(actual, expected);
//    }
//}
