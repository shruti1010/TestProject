package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	 
	  
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			String url = "http://staging.mydailylive.com/";
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"login-modal-trigger\"]")).click();
			driver.findElement(By.id("login-email")).sendKeys("shruti@koder.com");
			driver.findElement(By.id("login-password")).sendKeys("shruti123");
			driver.findElement(By.id("login-button")).click();
			
  }
}
