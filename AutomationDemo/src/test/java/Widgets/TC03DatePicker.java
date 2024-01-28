package Widgets;
import org.openqa.selenium.TimeoutException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;
import Elements.WebElement;
import freemarker.template.utility.DateUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03DatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/date-picker");
	    //Click and open the Date Picker
        driver.findElement(By.id("datePickerMonthYearInput")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown']")));
        String aMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).getText();
        String aYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).getText();
        while(!(aMonth.equals("July")&& aYear.equals("2028"))){
        	driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
        	aMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).getText();
            aYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).getText();
            
        	
        	
        }
        
        driver.findElement(By.xpath("//div[@aria-label='Choose Friday, July 26th, 2024']")).click();
        
        	}

}
