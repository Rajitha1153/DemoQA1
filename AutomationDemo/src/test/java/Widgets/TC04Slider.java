package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Elements.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04Slider {

	private static WebElement slider;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/slider");
	  driver.findElement(By.xpath("//input[@type='range']")).click();

	   Actions actions= new Actions(driver);
	   //279,196
	   actions.clickAndHold().moveByOffset(196,279).release().perform();
	   
	   
	   driver.quit();
	}

}
