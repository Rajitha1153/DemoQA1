package Interactions1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01Soratble{

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch browser
		driver.get("https://demoqa.com/sortable");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 300).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
