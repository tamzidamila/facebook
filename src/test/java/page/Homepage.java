package page;

import model.HomeModel;
import org.openqa.selenium.WebDriver;

public class Homepage extends HomeModel {
    public Homepage(WebDriver d){
        super(d);
    }
    public void typeCredential(String username, String password){
        getUserName().sendKeys(username);
        getPassword().sendKeys(password);
    }
    public void clickOnLoginBtn(){
        getLogin().click();
    }
}
