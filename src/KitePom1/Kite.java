package KitePom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();

			driver.get("https://kite.zerodha.com/");
			Thread.sleep(500);
			
			WebElement userid = driver.findElement(By.id("userid"));
			WebElement pass = driver.findElement(By.id("password"));
			WebElement logbutton = driver.findElement(By.xpath("//button[@type='submit']"));
			
			userid.sendKeys("ELR321");
			pass.sendKeys("Dhana1111");
			logbutton.click();
			Thread.sleep(500);

	}

}
