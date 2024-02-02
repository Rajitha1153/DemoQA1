package Interactions1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04Droppable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		//Launch browser

				driver.get("https://demoqa.com/droppable");
				Thread.sleep(2000);
				JavascriptExecutor js= (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0,300)","");
			    Actions a = new Actions(driver);
						   a.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"))).build().perform();
			   System.out.println("drag and drop performed");
						   driver.quit();
	}

}
