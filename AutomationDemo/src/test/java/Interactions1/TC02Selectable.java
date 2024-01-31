package Interactions1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;

public class TC02Selectable {

	public static void main(String[] args) throws InterruptedException {
	
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//Launch browser

		driver.get("https://demoqa.com/selectable");
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 300).perform();
        Thread.sleep(2000); 
        
        driver.findElement(By.xpath("//li[normalize-space()='Morbi leo risus']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[normalize-space()='Cras justo odio']")).click();
		Thread.sleep(2000); 
		
        
       driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("//li[normalize-space()='One']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[normalize-space()='Four']")).click();
		Thread.sleep(2000); 
		
		driver.close();
	
	}

}
