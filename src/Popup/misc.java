package Popup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class misc {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		link.size();
		System.out.println(link.size());
		
		for(WebElement l:link) 
		{
			System.out.println(l.getText());
		}
		
	}

}
