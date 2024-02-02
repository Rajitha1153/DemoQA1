package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01TextBox {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    //maximize window
		    driver.manage().window().maximize();
		    //launch browser
		    driver.get("https://demoqa.com/text-box");
		   //filling details in textboxes
		    driver.findElement(By.xpath("//li[@id='item-0']")).click();
		    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rajitha");
		    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sanerajitha@gmail.com"); 
		    driver.findElement(By.id("currentAddress")).sendKeys("Anantapur");
		    driver.findElement(By.id("permanentAddress")).sendKeys("Anantapur");
		    driver.findElement(By.id("submit")).click();
		    
		   //scroll down page
		    JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,300)","");
		    System.out.println("TextBox form filled");

		    Thread.sleep(5000);
		    
		   driver.quit();
	}

}
