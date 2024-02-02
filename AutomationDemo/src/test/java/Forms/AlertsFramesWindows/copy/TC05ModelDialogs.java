package Forms.AlertsFramesWindows.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05ModelDialogs {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/modal-dialogs");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	   js.executeScript("window.scrollBy(0,300)","");
	   driver.findElement(By.id("showSmallModal")).click();
	   driver.findElement(By.id("closeSmallModal")).click();
driver.quit();
	  
	}

}
