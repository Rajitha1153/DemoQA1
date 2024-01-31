package Widgets;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

		public class TC05ProgressBar1 {

			public static void main(String[] args) {
				 WebDriverManager.chromedriver().setup();
				   WebDriver driver = new ChromeDriver();
				   driver.manage().window().maximize();
				 
				   driver.get("https://demoqa.com/progress-bar");
				   driver.findElement(By.xpath("//button[@id='startStopButton']")).click();
				 WebElement progress = driver.findElement(By.xpath("//div[@role='progressbar']"));
				   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
				   boolean progressStatus = wait.until(ExpectedConditions.attributeToBe(progress, "aria-valuenow", "10"));
				   if (progressStatus == true) {
			       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='resetbutton']"))).click();
				   driver.quit();
				   }
				   }

		

}
