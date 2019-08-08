package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//Initialize the browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://staging.mydailylive.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Sign up Link
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/nav/div[3]/div[2]/div/div[2]/div/a/span")).click();
		driver.findElement(By.id("register-username")).sendKeys("test1");
		driver.findElement(By.id("register-first-name")).sendKeys("shruti");
		driver.findElement(By.id("register-last-name")).sendKeys("test");
		driver.findElement(By.id("register-email")).sendKeys("shruti@koder.com");
		driver.findElement(By.id("register-password")).sendKeys("shruti123");
		driver.findElement(By.id("signup-button")).click();
		//Click on Login link
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-modal-trigger\"]")).click();
		driver.findElement(By.id("login-email")).sendKeys("shruti@koder.com");
		driver.findElement(By.id("login-password")).sendKeys("shruti123");
		driver.findElement(By.id("login-button")).click(); //Login Successful
		}

}
