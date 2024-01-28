package Elements;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC07BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		//Inatiate driver
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    //maximize page
	    driver.manage().window().maximize();
        //Implicit wait for 10 secs
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //open URL of app
	    driver.get("https://demoqa.com/broken");
        //wait 
	    Thread.sleep(5000);
	    //capture links from a webpage
	   @SuppressWarnings("unchecked")
	List<WebElement> links=  driver.findElements(By.tagName("a"));
	   int brokenLinks=0;
	   //Number of links
	 //  System.out.println(links.size());
	   
	   for(WebElement element:links)
	   {
		   //by using href attribute we can get URL of required link
		   String url = element.getAttribute("href");
		   if(url==null || url.isEmpty())
		   {
			   System.out.println("URL is empty");
			   continue;
			   }
		   @SuppressWarnings("deprecation")
		URL link=new URL(url);
		   try
		   {
			   //create connection using url object 'link'
			   HttpURLConnection httpconn =(HttpURLConnection) link.openConnection();
			   httpconn.connect();
			   if(httpconn.getResponseCode()>=400)
			   {
				   System.out.println(httpconn.getResponseCode()+url+"is"+"Broken Link");
				   brokenLinks++;
			   }else 
			   {
				   System.out.println(httpconn.getResponseCode()+url+"is"+"Valid Link");
			   }
		   }
		   catch(MalformedURLException e ) {
			   //todo autp generatedbcatch block
			   e.printStackTrace();
			   
		   }
		 
		   //wait time 2 seconds
		   Thread.sleep(2000);
		   //establish connection
		 
		  }   
	   System.out.println("Number of Broken Links:"+brokenLinks);
	   driver.quit();
	   }  
	}


