package MainProjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\razan\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Open URL
		driver.navigate().to("https://www.vision2030.gov.sa");

	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
		driver.quit();
	}

}
