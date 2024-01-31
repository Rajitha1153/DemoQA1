package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06Tabs {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/tabs");
		    driver.findElement(By.id("demo-tab-origin")).click();
		    driver.quit();
		    
	}

}
