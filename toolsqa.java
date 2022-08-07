package Verfone.UiFramework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsqa {
	
	public static void testdynamicTable(WebDriver driver)
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubW
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		testdynamicTable(driver);

	}

}
