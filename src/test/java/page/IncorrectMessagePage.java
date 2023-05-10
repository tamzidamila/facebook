package page;

import model.IncorrectMessageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncorrectMessagePage extends IncorrectMessageModel {
    public IncorrectMessagePage(WebDriver d){
        super(d);
    }
    public String getInvalidMessage() throws InterruptedException {
        WebElement messg = getIncorrectMessage();
        return messg.getText();
    }

}
