import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchInFF {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hemanth\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
}
