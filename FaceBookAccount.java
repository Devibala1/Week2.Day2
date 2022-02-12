package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Devi");
		
		//driver.findElement(By.id("u_d_d_KU")).sendKeys("bala");
		driver.findElement(By.name("lastname")).sendKeys("bala");
		driver.findElement(By.name("reg_email__")).sendKeys("e@d.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
		Select day= new Select(driver.findElement(By.name("birthday_day")));
		day.selectByVisibleText("5");
		Select month = new Select(driver.findElement(By.name("birthday_month")));
		month.selectByIndex(2);
		Select year=new Select(driver.findElement(By.name("birthday_year")));
		year.selectByValue("1984");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
