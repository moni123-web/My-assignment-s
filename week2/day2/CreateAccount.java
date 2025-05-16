package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Vinoanbu");
			driver.findElement(By.name("description")).sendKeys("Selenium is an Open-Source suite of software tools and libraries used to automate web browsers");

			WebElement createAccount= driver.findElement(By.name("industryEnumId"));//creating dropdown
			Select dropdown1 = new Select(createAccount);
			dropdown1.selectByIndex(3);
			//Select "S-Corporation" as ownership using SelectByVisibleText. 
			
			WebElement createAccount2= driver.findElement(By.name("ownershipEnumId"));
			Select dropdown2= new Select(createAccount2);
			dropdown2.selectByVisibleText("S-Corporation");
			
			//Select "Employee" as the source using SelectByValue. 
			WebElement createAccount3= driver.findElement(By.name("dataSourceId"));
			Select dropdown3= new Select(createAccount3);
			dropdown3.selectByValue("LEAD_EMPLOYEE");
			
			//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
			
			WebElement createAccount4 = driver.findElement(By.name("marketingCampaignId"));
			Select dropdown4 = new Select (createAccount4);
			dropdown4.selectByIndex(6);
			
		    //Select Texas as the state/ province using SelectByValue
			WebElement createAccount5 = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select dropdown5 = new Select (createAccount5);
			dropdown5.selectByIndex(50);
			
			//Submiting create account

			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click(); //close
							
	}




	}


