package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("crmsfa")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-tc']//a)[2]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(".com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String l=driver.findElement(By.xpath("//div[@class='x-grid3-body']//a[1]")).getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-body']//a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Duplicate Lead")).click();
		String l=driver.findElement(By.id("createLeadForm_firstName")).getText();
		driver.findElement(By.className("smallSubmit")).click();
		String r=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (l==r)
			System.out.println("Duplicate lead create");
		else
			System.out.println("Duplicate lead Not created");
		
		

	}

}
