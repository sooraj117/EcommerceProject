package sampleprojectMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Realp {
	
	WebDriver driver;
	@Test
	public void tc2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
		
	     driver.get("https://adactin.com/HotelApp/index.php");
	     driver.manage().window().maximize();
	     WebElement x = driver.findElement(By.id("username"));
	     x.sendKeys("vengatram");
	     WebElement x1 = driver.findElement(By.name("password"));
	     x.sendKeys(Keys.CONTROL,"ac");
	     x1.sendKeys(Keys.CONTROL,"v");

		
		
		
	}

}
