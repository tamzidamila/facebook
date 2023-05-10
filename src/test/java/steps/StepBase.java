package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Homepage;

public class StepBase {
    static WebDriver driver;
    Homepage homepage;

    @Before("@Chrome")
    public void before() {
        driver = getDriver("Chrome");
        driver.manage().window().maximize();
        homepage = new Homepage(driver);
    }

    @After
    public void after() {
        // driver.quit();
    }

    public WebDriver getDriver(String browser) {
        if (driver == null) {
            if (browser.equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
                driver = new ChromeDriver();
            }
        }
        return driver;
    }
}