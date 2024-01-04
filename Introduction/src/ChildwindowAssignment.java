import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//ul/li[33]/a")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);

		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.xpath("//div[2]/div/div/h3")).getText());

	}

}
