package www.demo.demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cucmbertest {

	WebDriver driver;

	@Given("user launch browser")
	public void user_launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
	}

	@When("user enter my url")
	public void user_enter_my_url() {
		driver.get("https://www.spicejet.com/");		
	}

	@When("user enter my email id")
	public void user_enter_my_email_id() {
		driver.findElement(By.xpath("//div[text()='Currency']/..")).click();
	}

	@When("user enter")
	public void user_enter() {
		driver.findElement(By.xpath("//div[text()='Currency']/../..//div[text()='USD']")).click();
	}

	@When("user close browser")
	public void user_close_browser() {
		driver.close();
	}


}
