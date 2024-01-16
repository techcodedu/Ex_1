package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        
        try {
            // Navigate to "https://the-internet.herokuapp.com/login".
             driver.get("https://the-internet.herokuapp.com/login");

            // Locate the username input field using By.id and enter a predefined username.
            WebElement uName = driver.findElement(By.id("username"));
            uName.sendKeys("tomsmith");
            // Locate the password input field using By.name and enter a predefined password.
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("SuperSecretPassword!");


            // Find the login button using By.className and perform a click action.
            WebElement btn = driver.findElement(By.className("radius"));
            btn.click();

            // After the login action, use By.tagName to locate an element on the new page and retrieve its text.
            WebElement text = driver.findElement(By.tagName("h2"));
            String texttoValidate = text.getText();

            // Validate the text to verify successful login.
            if(texttoValidate.contains("Secure Area")){
                System.out.println("Login Successful");
            }else{
                System.out.println("Failed Login");
            }

        } catch (Exception e) {
           e.printStackTrace();
        }finally{
            driver.quit();
        }

     
    }
}
