package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KoderTest {
	
		WebDriver driver;
		@BeforeTest
		public void browserInitialization() {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		@Test(priority=1)
		public void contact(){
		
			driver.manage().window().maximize();
			driver.get("http://www.koder.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"menu2\"]/div/div/div[2]/div/ul/li[1]/a")).click();  //click on Contact link
			driver.findElement(By.name("fname")).sendKeys("Test");
			driver.findElement(By.name("lname")).sendKeys("Test");
			driver.findElement(By.name("company")).sendKeys("TestCompany");
			driver.findElement(By.name("email")).sendKeys("test@koder.com");
			driver.findElement(By.name("message")).sendKeys("Test Message");
			driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[5]/button")).click();
		}
		
		@Test(priority=2)
		public void signUp(){
			
			driver.manage().window().maximize();
			driver.get("http://www.koder.com/signup");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("firstName")).sendKeys("test");
			driver.findElement(By.id("lastName")).sendKeys("test");
			driver.findElement(By.id("emailAddress")).sendKeys("test@koder.com");
			Select dropdwn = new Select(driver.findElement(By.id("eventName")));
			dropdwn.selectByVisibleText("Google Search");
			driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/form/div[4]/div[2]/label")).click();
			driver.findElement(By.xpath("//*[@id=\"signUpForm\"]/div[7]/button")).click();
		}
//		@AfterTest
//		public void closeBrowser() {
//			driver.close();
//		}
	}
