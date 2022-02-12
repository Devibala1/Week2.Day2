package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.className("crmsfa")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
//Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hello");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
String fn=driver.findElement(By.id("viewLead_firstName_sp")).getText();

System.out.println(driver.getTitle());
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']")).clear();
driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']")).sendKeys("Hello123");

driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
if (fn.equals(driver.findElement(By.id("viewLead_firstName_sp")).getText()))
	System.out.println("not updated");
else 
	System.out.println("Updated");
driver.close();

	}

}
