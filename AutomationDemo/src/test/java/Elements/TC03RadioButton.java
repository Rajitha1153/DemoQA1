package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
        Thread.sleep(5000);
        System.out.println("Radio button selected");
        driver.quit();
        

	}

}
