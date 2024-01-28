package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05Buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/buttons");    
	    WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	    Actions actions = new Actions(driver);
	    actions.doubleClick(button).build().perform();
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,200)","");
	    Thread.sleep(5000);
	    System.out.println("double click perform");
	    driver.quit();
	    
       


	}

}
