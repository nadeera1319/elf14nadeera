package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("nadeera1319@gmail.com");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("citylights252");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@title='STudents']")).click();
	    Actions actions=new Actions(driver);
	   Thread.sleep(2000);
	   // WebElement source = driver.findElement(By.xpath("//span[text()='rekha']"));
	    // WebElement dest = driver.findElement(By.xpath("//textarea[text()='Doing']"));
	     Thread.sleep(2000);
	     actions.click().clickAndHold();
	    // actions.release(dest).perform();
	
	}
}
