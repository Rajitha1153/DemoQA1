package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC04WebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.id("firstName")).sendKeys("Rajitha");
        driver.findElement(By.id("lastName")).sendKeys("Reddy");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sanerajitha@gmail.com");
        driver.findElement(By.id("age")).sendKeys("31");
        driver.findElement(By.id("salary")).sendKeys("500000");
        driver.findElement(By.id("department")).sendKeys("Testing");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys("Rajitha");
        driver.findElement(By.xpath("//span[@id='basic-addon2']")).click();

	    Thread.sleep(5000);
	    System.out.println("registerform filled");
	    driver.quit();
	    
	}

}
