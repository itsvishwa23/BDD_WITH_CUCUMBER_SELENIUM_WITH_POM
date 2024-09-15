package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_page {

    WebDriver driver;
    By uid = By.xpath("//input[@id='username']");
    By pass = By.xpath("//input[@id='password']");
    By login_btn = By.xpath("//button[@id='submit']");

    public login_page(WebDriver driver) {
        this.driver = driver;
        driver.get("https://practicetestautomation.com/practice-test-login/");
        
    }

    public void on_login_page() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(login_btn).click();
    }

}

