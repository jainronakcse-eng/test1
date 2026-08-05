import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsInSel {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List<WebElement> lst =driver.findElements(By.tagName("a"));

        for(int i=0 ;i <lst.size();i++){
            System.out.println(lst.get(i).getText());
            System.out.println(lst.get(i).getAttribute("href"));
            System.out.println("**************");
        }
    }
}
