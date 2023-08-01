package operationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleForSingledropdown {


	//single select DropDown...
		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 driver.get("file:///C:/Users/Priyanka%20Hood/Desktop/wcsm8/dropdown.html");
			 
			 WebElement dropdown = driver.findElement(By.name("menu"));
			 
			 Select sel = new Select(dropdown);
			 boolean verify = sel.isMultiple();
			 System.out.println(verify);
			
		}
}
