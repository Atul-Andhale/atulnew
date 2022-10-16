package WebDriverMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WedElementMethod {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Honda");
		

	}

}
