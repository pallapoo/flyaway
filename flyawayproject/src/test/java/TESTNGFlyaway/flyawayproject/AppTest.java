package TESTNGFlyaway.flyawayproject;

import org.testng.Reporter;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest 
{
	@Test
	
	public void launchbroser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8081/FlyAway/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/a[2]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("amit@amit.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("aaaaaa");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/button")).click();
		Reporter.log("Login successfully");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/select")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/select/option[3]")).click();
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/select")).click();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/select/option[5]")).click();
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[3]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[6]/a")).click();
		driver.findElement(By.xpath("/html/body/a[6]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		
		driver.findElement(By.xpath("/html/body/a[4]")).click();
		
	}
	
}