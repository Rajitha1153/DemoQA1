package Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;
import Elements.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02AutoComplte {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/auto-complete");
		    WebElement from = (WebElement) driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--has-value css-1hwfws3']"));
		   from.click();
		   from.sendKeys("Red");
		   from.sendKeys(Keys.ARROW_DOWN);
		   from.sendKeys(Keys.ENTER);
		 //  from.sendKeys("Green");
		 //  from.sendKeys(Keys.ARROW_DOWN);
		  // from.sendKeys(Keys.ENTER);
		   
		   
		   
		   
	}

}
