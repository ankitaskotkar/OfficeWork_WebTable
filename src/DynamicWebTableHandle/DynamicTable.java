package DynamicWebTableHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/");
		
		
		driver.findElement(By.name("email")).sendKeys("ankitaskotkar@gmail.com	");
		driver.findElement(By.name("password")).sendKeys("Music#321");
		
		driver.findElement(By.xpath("//div[starts-with(@class,'ui fluid')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	
		Thread.sleep(3000);
		
		//Method 1:
		/*
		String beforeXPath="//div[@id='ui']//following::tr[";
		String  afterXpath= "]//td[2]";
		
		for(int i=2;i<7;i++) {
			String name=driver.findElement(By.xpath(beforeXPath+i+afterXpath)).getText();
			System.out.println(name);
			if(name.contains("Ankita KOtkar")) {
				driver.findElement(By.xpath(beforeXPath+i+"]//td[1]")).click();
			}
		}
		*/
		
		

		//Method 2 : directly providing xpath of the element which needs to be selected instead of writing for loop : more preferable
		//driver.findElement(By.xpath("//td[contains(text(),'Ankita')]//preceding-sibling::td//div")).click();
		//driver.findElement(By.xpath("//td[starts-with	(text(),'Ankita')]//preceding-sibling::td//div")).click();
		
		//driver.findElement(By.xpath("//td[ends-with(text(),'KOtkar')]//preceding-sibling::td//div")).click();		

		
		
	}

}
