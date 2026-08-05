import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopUpWindowHandle1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("PopUp")).click();
        String parId = driver.getWindowHandle();
        Set<String> winids = driver.getWindowHandles();
        String childWind = null;
        for (String str : winids) {
            driver.switchTo().window(str);
            String url = driver.getCurrentUrl();
            if (url.contains("selenium")) {
                childWind = str;
            }
            if (url.contains("playwright") ) {
                driver.close();
            }
        }
        driver.switchTo().window(childWind);
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(parId);



    }
}
