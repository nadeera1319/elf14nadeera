package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementUsingxy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Actions actions=new Actions(driver);
		WebElement mensSection = driver.findElement(By.partialLinkText("MEN"));
		actions.moveToElement(mensSection,300,0).perform();
		driver.findElement(By.linkText("Jackets")).click();
		
	

}

	
	
	
	
	
	
	
	

}
