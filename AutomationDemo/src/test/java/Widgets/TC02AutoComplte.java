package Widgets;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.NoSuchElementException;
import Elements.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02AutoComplte {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://demoqa.com/auto-complete");
		    WebElement  element =(WebElement) driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']"));
		      Actions actions = new Actions(driver);
		      actions.click();
		    
		 	
		   
	}

}
