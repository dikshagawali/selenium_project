import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("diksha");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("diksha@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dikshagawali321@gmail.com");
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("9764438208");
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		driver.close();
		
		
	    
	    
	    
	    
	    		
	
		
		
		
		
		

	}

}
