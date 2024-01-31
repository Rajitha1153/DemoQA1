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

public class TC05ProgressBar {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable
WebDriverManager.chromedriver().setup();
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the web page with the progress bar
        driver.get("https://demoqa.com/progress-bar");
        //Maximize the window
	    driver.manage().window().maximize();

        // Find the progress bar element
         driver.findElement(By.xpath("//button[@id='startStopButton']")).click(); 
         WebElement progressbar = driver.findElement(By.xpath("//div[@role='progressbar']"));
         Thread.sleep(7000);
         driver.findElement(By.xpath("//button[@id='resetButton']")).click();
     driver.quit();
         }
      
    }
