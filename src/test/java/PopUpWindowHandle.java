import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PopUpWindowHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("PopUp")).click();
        String parId = driver.getWindowHandle();
        Set<String> winids= driver.getWindowHandles();

        for(String str : winids){
           driver.switchTo().window(str);
            String url = driver.getCurrentUrl();
            if(url.contains("selenium")){
                break;
            }
        }
        System.out.println(driver.getCurrentUrl());



    }
}
