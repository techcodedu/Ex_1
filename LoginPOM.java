package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// POM
public class Login {
    private WebDriver driver;
    // data members
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private By loginBtnLocator = By.tagName("button");
    private By message = By.tagName("h2");
    
    // constructor 
    public Login(WebDriver driver){
        this.driver = driver;
    }
    
    // methods user defined
    public void enterUsername(String username){
        driver.findElement(usernameLocator).sendKeys(username);
    }

    // password 
    public void enterPassword(String password){
        driver.findElement(passwordLocator).sendKeys(password);
    }
    
    // login button
    public void clickLogin(){
        driver.findElement(loginBtnLocator).click();
    }
    public String nofications(){
       return driver.findElement(message).getText();
    }

}
