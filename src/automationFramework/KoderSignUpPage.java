package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class KoderSignUpPage {

	@Test
	public static void main(String[] args) {

				//Initialize the browser
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
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

}
