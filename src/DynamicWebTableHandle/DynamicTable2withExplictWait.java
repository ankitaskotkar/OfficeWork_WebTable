package DynamicWebTableHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable2withExplictWait {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
		driver.findElement(By.name("email")).sendKeys("ankitaskotkar@gmail.com	");
		driver.findElement(By.name("password")).sendKeys("Music#321");
		
		driver.findElement(By.xpath("//div[starts-with(@class,'ui fluid')]")).click();
		
		/*	
		WebDriverWait object=new WebDriverWait(driver, 30);
		object.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i.users.icon"))).click();
		*/
		//or user below implicit wait 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("i.users.icon")).click();
	}

}
