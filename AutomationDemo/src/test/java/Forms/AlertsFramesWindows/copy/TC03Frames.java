package Forms.AlertsFramesWindows.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03Frames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    try
	    {
	    	//maximize the window
	    driver.manage().window().maximize();
	    //open URL
	    driver.get("https://demoqa.com/frames");
	    //To find no of frames available in the webpage
	    int count = driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println("Total frames available in the webpage:"+count);
	    //Locate the frame1 heading
        WebElement frame1Heading= (WebElement) driver.findElement(By.id("sampleHeading"));
        
        //Finding the text of the frame1 heading
        String frame1Text=frame1Heading.getText();
        
        //Print the heading
        System.out.println("Text of the frame1 heading is:"+frame1Text);
        
        //closing the driver
        driver.close();

	}
catch(Exception e) {
	System.out.println("Exception caught :"+e.getMessage());
	driver.quit();
}
	}    
}
