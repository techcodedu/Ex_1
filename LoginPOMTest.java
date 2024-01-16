package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest{
    private WebDriver driver;
    private Login login;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        login = new Login(driver);
    }
    
    @Test
    public void testLogin(){
        try {
            login.enterUsername("tomsmith");
            login.enterPassword("SuperSecretPassword!");
            login.clickLogin();

            String message = login.nofications();
            if(message.contains("Secure Area")){
                System.out.println("Login Successful");
            }else{
                System.out.println("Failed");
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    @After
    public void shutDown(){
        driver.quit();
    }

}   
