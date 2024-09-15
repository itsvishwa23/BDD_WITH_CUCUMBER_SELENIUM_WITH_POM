package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_visit_page {


    WebDriver driver;

    // Constructor to initialize the driver
    public google_visit_page(WebDriver driver) {
        this.driver = driver;


    }

    // Method to open Google
    public void openGoogleHomePage() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }


    public String getHomePageTitle() {
        return driver.getTitle();
    }


}
