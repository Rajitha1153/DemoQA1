package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC08UploadAndDownload {
@Test

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/upload-download");
	    driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Admin\\Downloads");
	    Thread.sleep(5000);
	    System.out.println("File Uploaded");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300)","");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
	    System.out.println("File downloaded");
	    Thread.sleep(5000);

	  driver.quit();
	}

}
