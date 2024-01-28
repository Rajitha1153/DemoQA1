package Forms;

import java.util.List;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/automation-practice-form");
	    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Rajitha");
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Reddy");
	    driver.findElement(By.id("userEmail")).sendKeys("sanerajitha@gmail.com");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300)","");
       List<WebElement> r = driver.findElements(By.xpath("//label[@for='gender-radio-2']"));
       for(WebElement e:r)
       {
    	   if(e.getText().equalsIgnoreCase("Male")) {
       }
       e.click();
	}
        driver.findElement(By.id("userNumber")).sendKeys("9966539590");
        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).clear();
       // driver.findElement(By.id("dateOfBirthInput")).sendKeys("27 Sep 1992");

        driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();     
        
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\\\Users\\\\Admin\\\\Downloads");   
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("window.scrollBy(0,300)","");
	    driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Anantapur");
	    
        Thread.sleep(5000);
        JavascriptExecutor js2= (JavascriptExecutor)driver;
	    js2.executeScript("window.scrollBy(0,300)","");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(5000);
        driver.quit();
	    
	    
	}

}
