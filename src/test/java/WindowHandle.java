import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();
        String parId = driver.getWindowHandle();
        Set<String> winids = driver.getWindowHandles();
        System.out.println(winids.size());
        Iterator itr = winids.iterator();
        while(itr.hasNext()){
           String id = (String) itr.next();
            driver.switchTo().window(id);
        }
        System.out.println(driver.getPageSource());
        driver.switchTo().window(parId);
        System.out.println(driver.getCurrentUrl());

    }
}
