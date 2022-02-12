package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver lead = new ChromeDriver();
		lead.manage().window().maximize();
		lead.get("http://leaftaps.com/opentaps/control/login");
		lead.findElement(By.id("username")).sendKeys("demosalesmanager");
		lead.findElement(By.id("password")).sendKeys("crmsfa");
		lead.findElement(By.className("decorativeSubmit")).click();
		lead.findElement(By.className("crmsfa")).click();
		lead.findElement(By.xpath("(//div[@class='x-panel-tc']//a)[2]")).click();
		lead.findElement(By.xpath("//a[text()='Find Leads']")).click();
		lead.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
		lead.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		lead.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("110");
		lead.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("10");
		lead.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("565656");
		lead.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		WebElement f= lead.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
		String	fl =f.getText();
		Thread.sleep(2000);
		lead.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
		lead.findElement(By.className("subMenuButtonDangerous")).click();
		lead.findElement(By.xpath("//a[text()='Find Leads']")).click();		
		lead.findElement(By.xpath("//input[@name='id']")).sendKeys(fl);
		//lead.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys(fl);
		lead.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String result= lead.findElement(By.xpath("//div[text() ='No records to display']")).getText();
		System.out.println(result);
		lead.close();
				
		
			
		

	}

}
