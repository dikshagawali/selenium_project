import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*
		 * driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		 * System.out.println(driver.findElement(By.id(
		 * "ctl00_mainContent_chk_friendsandfamily")).isSelected());
		 */
		
	System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	
	// Count the number of checkboxes
	
	
	System.out.println(driver.findElement(By.cssSelector("input[type= 'checkbox']")).getSize());

	
	}

}
