package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
  WebDriver driver;
	

	
	@Before
	public void init() {
		System.out.println("Before method");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\komma\\Selenium\\crmHW1\\driver\\chromedriver119.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void executeTestCase() throws InterruptedException {
		positiveLoginTest();
		addAccounts();
	}
	
	public void positiveLoginTest() throws InterruptedException {
		System.out.println("positive test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	
	public void addAccounts() throws InterruptedException {
		System.out.println("addAccounts");
				//Click on Bank & Cash button
				driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
				//click on add account 
				driver.findElement(By.xpath("//li/a[@href][text()='New Account']")).click();
				//Details to Add Account
				driver.findElement(By.id("account")).sendKeys("harika1239");
				driver.findElement(By.id("description")).sendKeys("Checking account");
				driver.findElement(By.id("balance")).sendKeys("$1000");
				driver.findElement(By.id("account_number")).sendKeys("788998734");
				driver.findElement(By.id("contact_person")).sendKeys("Sarika");
				driver.findElement(By.id("contact_phone")).sendKeys("5678943214");
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				//Thread.sleep(3000);
				
		
	}
	
	
	@After
	public void closeBrowser() {
		System.out.println("after method");
	//	driver.close();
	//	driver.quit();
	} 


	
	


}
