package WebDriverMethods1;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		
		TreeSet<String>ts=new TreeSet<>();
		
		Thread.sleep(2000);
		WebElement DropDown = driver.findElement(By.id("dropdown-class-example"));
		
		Select s=new Select(DropDown);
		
		List<WebElement> option  = s.getOptions();
		
		for(WebElement we:option) 
		{
			String Text = we.getText();
			ts.add(Text);
		}
		
		System.out.println(ts);
		
		for(String S1:ts) 
		{
			System.out.println(S1);
		}
	}

}
