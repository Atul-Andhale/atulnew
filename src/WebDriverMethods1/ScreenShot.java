package WebDriverMethods1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str=RandomString.make(3);
		File dst=new File("E:\\WORK\\screenshot\\Image1"+str+".png");
		
		
		
		FileHandler.copy(Source, dst);
		Thread.sleep(500);
		driver.close();
	}

}
