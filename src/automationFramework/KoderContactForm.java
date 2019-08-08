package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KoderContactForm {
	
	public static void main(String[] args) throws InterruptedException {
		//Initialize the browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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
		//driver.close();

}
}