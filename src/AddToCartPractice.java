import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hemanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
			String[] veg= {"Cucumber","Brocolli"};
		int j=0;
		List<WebElement> items=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<items.size();i++)
		{
			String[] itemName=items.get(i).getText().split("-");
			String trimName=itemName[0].trim();
			List al=Arrays.asList(veg);
			if(al.contains(trimName))
			{
				j++;
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
				if(j==veg.length)
					break;
			}
		}


	}

}
