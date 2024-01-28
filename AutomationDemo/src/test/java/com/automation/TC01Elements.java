package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01Elements {

	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/text-box");
    driver.findElement(By.xpath("//li[@id='item-0']")).click();
    driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Rajitha");
    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("sanerajitha@gmail.com");    

    Thread.sleep(5000);
    
   driver.quit();
	}

}
