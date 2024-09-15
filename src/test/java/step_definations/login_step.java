package step_definations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.login_page;

public class login_step {

    WebDriver driver = new ChromeDriver();
    login_page lp = new login_page(driver);


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        lp.on_login_page();

    }

    @When("the user enters the username  and the password")
    public void the_user_enters_the_username_and_the_password() {


    }

    @When("clicks on the login button")
    public void clicks_on_the_login_button() {

    }

    @Then("a welcome message should be displayed")
    public void a_welcome_message_should_be_displayed() {

    }

}
