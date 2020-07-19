package sampleprojectMaven;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.gridfs.CLI;

public class TestNG {
	
	WebDriver driver;
	
	WebElement fdf;
	@Test(priority=0)
	private void tc1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("http://demo.automationtesting.in/Register.html");
	     
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.spicinemas.in/user/register");
	     
	     String coimbat = "//div//div//form//div//div//b[@class='dropdown-arrow']";
	     WebElement ss = driver.findElement(By.xpath(coimbat));
	     ss.click();
	     Thread.sleep(5000);
	     WebElement vv = driver.findElement(By.className("//div[@class='selectric']"));
         Select s = new Select(vv);
         s.selectByIndex(2);
         

	}
}
