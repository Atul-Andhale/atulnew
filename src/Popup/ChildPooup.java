package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPooup {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewWindow")).click();
		
//		all pageId
		
		Set<String> AllPageId = driver.getWindowHandles();
		
		Iterator<String> it = AllPageId.iterator();
		
	    String mainpage = it.next();
	   String childpage = it.next();
	   
	   
	   driver.switchTo().window(childpage);

	   Thread.sleep(2000);
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");

	   Thread.sleep(500);
	   driver.close();
	   Thread.sleep(500);

	}

}
