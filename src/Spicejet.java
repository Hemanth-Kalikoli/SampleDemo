import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("divpaxinfo")).click();
		

	Select s=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
	
	s.selectByIndex(1);
	s.selectByValue("3");
	s.selectByVisibleText("6");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Chennai (MAA)']")).click();
	driver.findElement(By.xpath("//div[contains(@id,'destinationStation1')]//a[text()=' Bengaluru (BLR)']")).click();
	driver.close();
	}

}
