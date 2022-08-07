package Verfone.UiFramework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jobvite {
	
	public static void getBasicData(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.close();
		
		scrollDown(driver);
		
		
	}
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		dropDown(driver);
		
	}
	
	public static void dropDown(WebDriver driver)
	{ 
		driver.findElement(By.xpath("//span[@class='arrow']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='slide-down']/a"));
		
		System.out.println(ele.size());
		ArrayList<String> al=new ArrayList<String>();
		
		 for(WebElement ele1 : ele) {
	            
	            al.add(ele1.getText());
	        }
		System.out.println("Before sorting "+al);
		
		Collections.sort(al);
		System.out.println("After sorting "+ al);
		takeSS(driver);
		
		
		
//		for(int i=0;i<ele.size();i++)
//		{
//			WebElement element=ele.get(i);
//			 value=value+element.getText();
//			//System.out.println(value);
//			

	
			
//			if(value.equalsIgnoreCase("Life at Jobvite"))
//				element.click();
			
//		}
		
		
		
		
		
		
		
		 
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
//		clickOnTour(driver);
		
}	
		
	public static void takeSS(WebDriver driver)
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     try {
			FileHandler.copy(src, new File("PageScreenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	     System.out.println("screenshot done" );
	}

	
	public static void clickOnTour(WebDriver driver)
	{
		driver.findElement(By.xpath("//a[contains(text(),'Watch')]")).click();
		
		
		
		
		Set<String> handler= driver.getWindowHandles();
		ArrayList<String> ls=new ArrayList<>(handler);
		
		System.out.println(ls.size());
		String pWindow=ls.get(0);
		driver.switchTo().window(pWindow);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(ls.get(1));
		
	}
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.jobvite.com/blog/"); 
		getBasicData(driver);
		
		
	}

}
