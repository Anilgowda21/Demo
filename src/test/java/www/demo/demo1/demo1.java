package www.demo.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	WebDriver driver;
	//@BeforeTest
	public void beforetest() {
		System.out.println("before");
		
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		//driver.quit();
	}
	
	
	@Test
	public void test() {
		System.out.println("hello testng");
		driver.findElement(By.xpath("//div[text()='Currency']/..")).click();
		driver.findElement(By.xpath("//div[text()='Currency']/../..//div[text()='USD']")).click();
		//driver.quit();
	}
	

	@Test
	public void test2() {
		System.out.println("hello testng2");
	}
	
}
