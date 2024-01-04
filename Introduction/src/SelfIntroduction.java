import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Invoking Browser
		//Webdriver methods + class methods
	
		//ChromeDriver Obj = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhis\\OneDrive\\Desktop\\Selenium\\chrome-headless-shell.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close(); // close only current window 
		driver.quit(); // close multiple windows(all tabs)
		
		
	
	}

}

