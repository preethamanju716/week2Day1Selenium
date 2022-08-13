package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramanian");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Preetha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Prospective customer");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("s.pree.mit@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		
		String t=driver.getTitle();
		System.out.println(t);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Freshworks");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("PreethaSubramanian");
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		String t1=driver.getTitle();
		System.out.println(t1);
		
		
		

	}

}
