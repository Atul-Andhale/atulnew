package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscunorderd {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(500);
		List<WebElement> search = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		search.size();
		
		System.out.println(	search.size());
		
		for(WebElement s:search) 
		{
			String actual = s.getText();
			String expected="honda amaze";
			
			if(actual.equalsIgnoreCase(expected)) 
			{
			 s.click();
			 break;
			}
		}
		
		
}
	}
