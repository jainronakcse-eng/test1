package TestNgProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Auto1 {
    WebDriver driver;

    @Test
    public void testCase1() {
        driver.findElement(By.id("uid")).sendKeys("jsmith");
        driver.findElement(By.id("passw")).sendKeys("demo12346");
        driver.findElement(By.name("btnSubmit")).click();
        boolean b = false;
        try {
             b = driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
           
        } catch (Exception e) {
            
           b=false;
        }
        Assert.assertTrue(b, "Test case faied : testCase1 due to wrong passowrd");
    }


    @BeforeMethod
    public void beforeMethod() {
        ChromeOptions options = new ChromeOptions();

        // Accept invalid or untrusted SSL certificates
        options.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(options);
        driver.get("https://testfire.net/login.jsp");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
//        driver.quit();
    }
}
