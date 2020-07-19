package sampleprojectMaven;

import org.openqa.selenium.support.PageFactory;

public class TestNgPOM extends TestNGBase {
	
  public TestNgPOM() {
	  
	  PageFactory.initElements(driver, this);
  }

}
