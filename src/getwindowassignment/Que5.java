package getwindowassignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.driver.chrome","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		WebElement link = driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		
	
		Point point = link.getLocation();
		int xaxis = point.getX();
		int yaxis= point.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
		
		String parenthandle = driver.getWindowHandle();
		
		link.click();
		Thread.sleep(2000);
		
		 Set<String> allhandle = driver.getWindowHandles();
			
			
			 for(String wh:allhandle)
			 {
				 if(!parenthandle.equals(wh))
				 {
					 
				     driver.switchTo().window(wh).manage().window().maximize();
			 }
				 
				 else {
					 driver.close();
				 }
			
}
}
}
