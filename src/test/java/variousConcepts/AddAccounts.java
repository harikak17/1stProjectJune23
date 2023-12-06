package variousConcepts;
//import org.openqa.Selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAccounts {

	public static void main(String[] args) {
		
		
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komma\\Selenium\\crmHomeWork1\\driver1\\chromedriver.exe");
		
		//System.setProperty("Webdriver.chrome.driver", "driver1/chromedriver.exe");
		
		//launching the browser
		WebDriver driver = new ChromeDriver();
		
		// go to web site 
		driver.get("https://codefios.com/ebilling/login");
		

	}

}
