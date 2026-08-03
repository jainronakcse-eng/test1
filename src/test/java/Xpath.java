import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Xpath {

	public static void main(String[] args) {
		
	    WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// single Dropdown
//		WebElement we = driver.findElement(By.id("country"));
//		Select sel = new Select(we);
//
//		sel.selectByIndex(2);
//
//		List<WebElement> lst = sel.getOptions();
//
//		for (int i = 0 ;i <lst.size();i++){
//			System.out.println(lst.get(i).getText());
//		}

		// multidropdown

		WebElement wemul = driver.findElement(By.id("colors"));
		Select mulsel = new Select(wemul);

		mulsel.selectByIndex(1);
		mulsel.selectByValue("yellow");

		List<WebElement> lst = mulsel.getOptions();

		for (int i = 0 ;i <lst.size();i++){
			System.out.println(lst.get(i).getText());
		}

               
	}

}
