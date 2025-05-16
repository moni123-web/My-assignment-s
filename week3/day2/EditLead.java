package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("GoTo");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vishagan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sai");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hii, I am Moni");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("monisharimi98@gamil.com");
		
		WebElement leadOptions =(WebElement) driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select((org.openqa.selenium.WebElement) leadOptions);
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("GoTo");
		driver.findElement(By.className("smallSubmit")).click();
		driver.getTitle();
	    driver.quit();
		
		
		


	}

}
