package WebDriverMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(500);
		
		driver.switchTo().frame("frame1");
		
		
		driver.findElement(By.xpath("//input")).sendKeys("Welcome..");
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame3");
		
		  WebElement checkbox = driver.findElement(By.id("a"));
		  checkbox.click();
		Thread.sleep(1000);
//		boolean verify = checkbox.isSelected();
//		System.out.println(verify);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		Thread.sleep(1000);
		WebElement ani = driver.findElement(By.id("animals"));
		
		Select s=new Select(ani);
		s.selectByVisibleText("Avatar");
		
		driver.close();
	}

}
