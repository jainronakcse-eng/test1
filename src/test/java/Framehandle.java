import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        WebElement ifrm =  driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(ifrm);
        String str = driver.findElement(By.id("draggable")).getText();
        System.out.println(str);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[text()='Resizable']")).click();
    }
}
