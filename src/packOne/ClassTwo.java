package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTwo {
	
	@Test
	public void methodTwoA() {
		
		System.out.println("Inside methodTwoA of ClassTwo");
		 
		 System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.facebook.com");
		 
		 driver.close();
		
	}
	
	@Test
	public void methodTwoB() {
		
		System.out.println("Inside methodTwoB of ClassTwo");
	
	}
	

}
