package Forms.AlertsFramesWindows.copy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NoSuchDriverException;
import Elements.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC04NestedFrames {
        public static void main(String[] args){
        	WebDriverManager.chromedriver().setup();
                // Initialize browser
                WebDriver driver=new ChromeDriver();        
        	    driver.manage().window().maximize();
                //Navigate to the demo site
                driver.get("https://demoqa.com/nestedframes");
                JavascriptExecutor js= (JavascriptExecutor)driver;
    		    js.executeScript("window.scrollBy(0,300)","");

                //Number of Frames on a Page
                int countIframesInPage = driver.findElements(By.tagName("iframe")).size();
                System.out.println("Number of Frames on a Page:" + countIframesInPage);
                
                //Locate the frame1 on the webPage
                org.openqa.selenium.WebElement frame1=driver.findElement(By.id("frame1"));                
                //Switch to Frame1
                driver.switchTo().frame(frame1);
                
                              //Locate the Element inside the Frame1
                WebElement frame1Element= (WebElement) driver.findElements(By.tagName("body"));
                
                //Get the text for frame1 element
                String frame1Text=frame1Element.getText();
                System.out.println("Frame1 is :"+frame1Text);
                
                //Number of Frames on a Frame1
                int countIframesInFrame1 =driver.findElements(By.tagName("iframe")).size();
                System.out.println("Number of iFrames inside the Frame1:" + countIframesInFrame1);
                
                //switch to child frame
                driver.switchTo().frame(0);
                
                int countIframesInFrame2 =driver.findElements(By.tagName("iframe")).size();
                System.out.println("Number of iFrames inside the Frame2:" + countIframesInFrame2);
                
                driver.close();
        }
}