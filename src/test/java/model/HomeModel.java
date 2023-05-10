package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel{
    public HomeModel(WebDriver d){
        super(d);
    }
    public WebElement getUserName(){
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        return username;
    }
    public WebElement getPassword(){
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        return password;
    }
    public WebElement getLogin(){
        return driver.findElement(By.xpath("//button[@name='login']"));

    }

}
