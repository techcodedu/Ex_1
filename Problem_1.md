
# Selenium WebDriver Exercise: Form Interaction and Validation

## Objective
Develop a Java Selenium WebDriver script to automate a test scenario on "https://the-internet.herokuapp.com/" with a focus on different Selenium locators and methods.

## Exercise Setup
- Ensure that Maven and Java are properly installed and configured.
- Use `pom.xml` to manage dependencies, including Selenium WebDriver and WebDriverManager.

## Dependencies in `pom.xml`
```xml
<!-- Selenium WebDriver -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>[latest_version]</version>
</dependency>

<!-- WebDriverManager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>[latest_version]</version>
</dependency>
```

## Scenario
- Navigate to "https://the-internet.herokuapp.com/login".
- Locate the username input field using `By.id` and enter a predefined username.
- Locate the password input field using `By.name` and enter a predefined password.
- Find the login button using `By.className` and perform a click action.
- After the login action, use `By.tagName` to locate an element on the new page and retrieve its text.
- Validate the text to verify successful login.

## Tasks
1. Initialize WebDriver using WebDriverManager.
2. Write code to perform each step in the scenario using the appropriate Selenium methods and locators.
3. Ensure the script runs smoothly and validates the login process correctly.
4. Handle any exceptions and ensure the browser closes after the script execution.

## Requirements
- Your code should be well-commented to explain the use of different Selenium locators and methods.
- Ensure proper use of WebDriverManager for browser driver setup.
- Include appropriate validation checks and error handling.
