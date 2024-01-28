package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc06Links {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/links");
	    Thread.sleep(5000);
	    //driver.findElement(By.linkText("Home")).click();
	    driver.findElement(By.partialLinkText("Home")).click();
        Thread.sleep(5000);
        //how to capture all the links
        List<org.openqa.selenium.WebElement> links=driver.findElements(By.tagName("a"));
	    System.out.println("Number of links present :"+links.size());
        driver.quit();
        
       
        
        }
        	
	    
	    
         
	    
	}


