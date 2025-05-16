package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("GOTO");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Monisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		
		WebElement leadOption=driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dropdown=  new Select (leadOption);
		dropdown.selectByIndex(5);
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("CreateLead");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.close();
			

	}

}
