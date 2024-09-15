package step_definations;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;

import pages.google_visit_page;

public class google_visit_step_defination {


    WebDriver driver;
    google_visit_page gp = new google_visit_page(driver);


    @Given("I open the browser")
    public void i_open_the_browser() {



    }

    @When("I navigate to google")
    public void i_navigate_to() {
        gp.openGoogleHomePage();


    }

    @Then("I should see the Google homepage")
    public void i_should_see_the_google_homepage() {
        gp.getHomePageTitle();

    }

}
