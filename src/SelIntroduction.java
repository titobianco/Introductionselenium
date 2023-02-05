import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction  {

	public static void main(String[] args) {
		
		//Invoking Browser 
		//Chrome - ChromeDriver -> Methods 
		// chromedriver.exe-> chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RS32889108\\Documents\\Automation\\WebDrivers\\chromedriver.exe");
		
		//Webdriver.chrome.driver-> value of path 
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl()); 
		//driver.close(); //Close the current window 
		//driver.quit();  //Close the current and the associates windows that was open by selenium 
		
		                         //Continues in V34
		
		
		
		
		
		
		            
	}

}
