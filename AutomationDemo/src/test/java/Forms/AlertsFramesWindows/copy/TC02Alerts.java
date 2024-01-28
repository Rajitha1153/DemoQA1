package Forms.AlertsFramesWindows.copy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/alerts");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300)","");
	    driver.findElement(By.id("promtButton")).click();
	    Thread.sleep(5000);
	    Alert alert= driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		alert.accept();
	    Thread.sleep(5000);
	    driver.quit();
	    
	}

}
