package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://en-gb.facebook.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    //click on the create new account buttons
	    driver.findElement(By.linkText("Create new account")).click();
	    
	    //enter the first name
	    driver.findElement(By.name("firstname")).sendKeys("Monisha");
	    
	    //enter the surname
	    driver.findElement(By.name("lastname")).sendKeys("Chidambaram");
	   
	    //enter email address or mobile no
	    driver.findElement(By.name("reg_email__")).sendKeys("testleaf@123.com");
	    
	    //enter the password
	    driver.findElement(By.id("password_step_input")).sendKeys("test@123");
	    
	     //handle all three drop downs in date of birth
	    Select day = new Select(driver.findElement(By.id("day")));
        day.selectByVisibleText("10");

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("May");

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("2022");
	    
	    //select the radio button in gender
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.quit();
	}
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
				
		
		
		
		
		
		
		
		
		
		
		

		
		

	


