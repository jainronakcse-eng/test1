import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//        driver.findElement(By.id("alertBtn")).click();
//        Alert alt = driver.switchTo().alert();
//        System.out.println(alt.getText());
//        alt.accept();
        Thread.sleep(3000);

//        driver.findElement(By.id("confirmBtn")).click();
//        Thread.sleep(3000);
//        Alert alt1 = driver.switchTo().alert();
//        System.out.println(alt1.getText());
//        alt1.accept();

        // Prompt
        driver.findElement(By.id("promptBtn")).click();
        Thread.sleep(3000);
        Alert alt2 = driver.switchTo().alert();
        System.out.println(alt2.getText());
        alt2.sendKeys("Neha");
        alt2.accept();

    }
}
