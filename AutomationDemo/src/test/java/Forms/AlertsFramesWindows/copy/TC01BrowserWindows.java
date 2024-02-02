package Forms.AlertsFramesWindows.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01BrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    
	   js.executeScript("window.scrollBy(0,300)","");
	    
        driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
        
        Thread.sleep(5000);
        System.out.println("New Message window opened");
        
        driver.quit();
        
	}

}
