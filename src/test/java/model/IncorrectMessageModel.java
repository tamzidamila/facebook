package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncorrectMessageModel extends BaseModel {
    public IncorrectMessageModel(WebDriver d) {
        super(d);
    }


    public WebElement getIncorrectMessage() throws InterruptedException {
    Thread.sleep(3000);
    return driver.findElement(By.xpath("//div[contains(text(),'incorrect')]"));
    }
}