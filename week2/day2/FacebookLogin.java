package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		        //launch the browser
				ChromeDriver driver=new ChromeDriver();
				
				//load the url
				driver.get("https://www.facebook.com");
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//enter the email id
				driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
				
				//enter the password
				driver.findElement(By.id("pass")).sendKeys("Tuna@321");
				
				//click on the login button
				driver.findElement(By.name("login")).click();
				
				//click on the 'find your account and log in' link
				driver.findElement(By.linkText("Find your account and log in.")).click();
				
				//find your account
				String title=driver.getTitle();
				System.out.println(title);
				
				driver.quit();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
