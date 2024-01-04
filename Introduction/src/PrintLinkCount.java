import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//1. Give me all links count
		//2. Give me only footer links counts
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElement(By.tagName("a")).getSize());
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //Give me only footer links counts
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); //Give me only footer links counts
		
		
		//3. Give me only 1 column link count which is present in footer
		
		WebElement coloumndriver= footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		// 4. Click on each link in the coloumn and check if the pages are opening
		
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
	}

}
