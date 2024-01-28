package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/checkbox");
       //select specific check box
        driver.findElement(By.xpath("//button[@title='Expand all']")).click();
        driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
        Thread.sleep(5000);
        
        System.out.println("Checkbox Selected");
        driver.quit();
        }

}