package sampleprojectMaven;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestNGBase {
	
	 static WebDriver driver;
	 static JavascriptExecutor js;
	 
	 public static void wbdriver(String url) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get(url);
	 }
	 
	 public static void wbelements(WebElement element,String url) {
		 element.sendKeys(url);
	 }
	 
	 public static void wbelementsclick(WebElement element) {
		 element.click();
	 }
	 
	 public static void action(WebElement element) {
		 Actions a = new Actions(driver);
		 a.contextClick(element);
	 }
	 
	 public static void movetoaction(WebElement element) {
		 Actions a = new Actions(driver);
		 a.moveToElement(element);
	 }
	 
	 public static void movedtoaction(WebElement element) {
		 Actions a = new Actions(driver);
		 a.moveToElement(element);
	 }
	 
	 public static void movetdoaction(WebElement element) {
		 Actions a = new Actions(driver);
		 a.moveToElement(element);
	 }
	 
	 public static void doubleaction(WebElement element) {
		 Actions a = new Actions(driver);
		 a.doubleClick(element);
	 }
	 
	 public static void robot () throws AWTException {
		 Robot r = new Robot();
	 }
	 
	 public static void select(WebElement element, String val) {
		 Select s = new Select(element);
		 s.selectByVisibleText(val);
	 }
	 
	 public static void screeshot(String url) {
		 
		 TakesScreenshot tk =(TakesScreenshot)driver;
		 File src =tk.getScreenshotAs(OutputType.FILE);
		 File desc = new File("C:\\Users\\sasti Nb\\eclipse-workspace\\sampleprojectMaven\\ScreenShot\\"+ url +".png");
		 FileUtils.copyFile(src, desc);
		 
	 }
	 
	 public static void javascriptrue(WebElement element) {
		 
		 js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)", element);
	 }
	 
     public static void javascriptfalse(WebElement element) {
		 
		 js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)", element);
	 }
	 
     public static void javaele(WebElement element) {
    	 Object obj = js.executeScript("return arguments[0].getAttribute('id')", element);
    	 String txt =(String)obj;
    	 System.out.println(txt);
    	 
     }
     
     public static void hardassert(String st1,String st2) {
    	 String url = driver.getCurrentUrl();
    	 boolean ddd = url.contains(st1);
    	 Assert.assertTrue(ddd, st2);
     }
     
     public static void softassert(String st1,String st2) {
    	 SoftAssert s = new SoftAssert();
    	 String url = driver.getCurrentUrl();
    	 boolean ddd = url.contains(st1);
    	 s.assertTrue(ddd, st2);
     }
	 
	 
}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
