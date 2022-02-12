package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver contact = new ChromeDriver();
		contact.manage().window().maximize();
		contact.get("http://leaftaps.com/opentaps/control/login");
		contact.findElement(By.id("username")).sendKeys("demosalesmanager");
		contact.findElement(By.id("password")).sendKeys("crmsfa");
		contact.findElement(By.className("decorativeSubmit")).click();
		contact.findElement(By.className("crmsfa")).click();
		contact.findElement(By.linkText("Contacts"));
		contact.findElement(By.linkText("Create Contact")).click();
		contact.findElement(By.id("firstNameField")).sendKeys("Devi");
		contact.findElement(By.id("lastNameField")).sendKeys("Bala");
		contact.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Test");
		contact.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Test");
		contact.findElement(By.id("createContactForm_departmentName")).sendKeys("science");
		contact.findElement(By.xpath("(//span[text()='Description']/following::textarea)[1]")).sendKeys("Hello Welcome to Descriptiom");
		contact.findElement(By.id("createContactForm_primaryEmail")).sendKeys("D@l.com");
		Select st = new Select(contact.findElement(By.name("generalCountryGeoId")));
		st.selectByIndex(2);
		contact.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		contact.findElement(By.xpath("//a[@class='subMenuButtonDangerous']/preceding-sibling::a")).click();
		contact.findElement(By.xpath("(//span[text()='Description']/following::textarea)[1]")).clear();
		contact.findElement(By.name("importantNote")).sendKeys("Import not");
		contact.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	
	
	
	}
	

}
