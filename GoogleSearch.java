package Verfone.UiFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");	
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium testing");
		Thread.sleep(500);
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@role='listbox']/li"));	
		
		
	int size=ele.size();
	
	for(int i=0;i<size;i++)
	{
		WebElement ele1=ele.get(i);
		String value=ele1.getText();
		System.out.println(value);
		
		if(value.equalsIgnoreCase("selenium testing certification"))
			ele1.click();
	}
		
		
		
		driver.close();
			
	}

}
