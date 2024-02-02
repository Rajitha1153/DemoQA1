package Widgets;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC09ToolTip {

	public static void main(String[] args) throws InterruptedException {
		//button[@id='toolTipButton']
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		 
		   driver.get("https://demoqa.com/tool-tips");
		   driver.findElement(By.xpath("//button[@id='toolTipButton']")).click();
		   Thread.sleep(2000);
		   driver.quit();
	}

}
