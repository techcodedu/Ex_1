
# TestNG Setup and Test Creation Instructions

## Setting up TestNG in Maven Project

### 1. Update `pom.xml`
Add the TestNG dependency to the Maven project. Include the following in your `pom.xml` file:

```xml
<!-- TestNG -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>[latest_version]</version>
    <scope>test</scope>
</dependency>
```

### 2. Create Test File
Create a new Java class file inside the `src/test/java` folder of your Maven project. This file will contain your test methods.

### 3. Using `@Test` Annotation
In your test class, create methods annotated with `@Test` from TestNG. These methods will be your test cases.

### 4. Writing Test Method
Write a test method that incorporates the methods from your Selenium WebDriver script. The method should assert the expected behavior of your web automation script.

```

