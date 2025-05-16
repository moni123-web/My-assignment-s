package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the un & pwd
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//clk on the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//clk on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//clk on the contacts button
		driver.findElement(By.linkText("Contacts")).click();
		//clk on merge contacts
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		// Click on the widget of the "From Contact"
		driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();	
		//getWindowHandle
		String parentWindow= driver.getWindowHandle();
		System.out.println("The parent address is:" +parentWindow);
		//0A317EA148DB2B53A16F84DC87815957
		//getWindowHandles
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("All window address is:" +allWindows);
		//             0                                 1
		//[0A317EA148DB2B53A16F84DC87815957, E0FF91A96790935E6B94B4C2A334C967]
        //convert set into list
		List<String> allAddress=new ArrayList<String>(allWindows);
		System.out.println("The List is:" +allAddress);
		//             0                                 1
	    //[D9D6A5764C6D00A4692CA9B2A10BB384, 251B2857D766B96E6F3E77677CDCBD1E]
        //transfer the driver focus
		driver.switchTo().window(allAddress.get(1));
		//Click on lick on the first resulting contact
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		//Back to pre existing driver
		driver.switchTo().window(allAddress.get(0));
		
		//Click on the widget of the "To Contact".
	    driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following::a")).click();
	    
	    Set<String> toContact = driver.getWindowHandles();
		System.out.println("All Window is :"+toContact);
		//Convert Set into List
		List <String> contact= new ArrayList<String>(toContact);
		System.out.println("The List is :"+contact);
		driver.switchTo().window(contact.get(1));
	    // Click on the second resulting contact. 
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();	
		//Back to pre existing driver
	    driver.switchTo().window(allAddress.get(0));
	    // Click on the Merge button.
		driver.findElement(By.linkText("Merge")).click();
		
		//Accept the alert.
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		//Verify the title of the page.
		String titleOfParents = driver.getTitle();
		System.out.println("After Switching:"+titleOfParents);
		
		driver.quit();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


