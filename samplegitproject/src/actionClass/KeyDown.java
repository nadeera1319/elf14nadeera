package actionClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.marimallappawomenscollege.org/");
		List<WebElement> menu = driver.findElements(By.xpath("//div[@id='chromemenu']/descendant::li"));
		Actions actions=new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		for(WebElement link:menu) {
			
			actions.click(link).perform();
		}
		actions.keyUp(Keys.CONTROL).perform();
		driver.quit();
	
		}

}
