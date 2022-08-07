package Verfone.UiFramework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class demoGuru99 {
	
	public static void DropDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
		driver.findElement(By.name("country")).click();
		
		List<WebElement> ls=driver.findElements(By.xpath("//select[@name='country']//option"));
		
		System.out.println(ls.size());
		
		for(int i=0;i<ls.size()-1;i++)
		{
			if(ls.get(i).getText().contains("ANGOLA"))
			{
				ls.get(i).click();
				break;
			}
		}
		
//		ArrayList<String> al=new ArrayList<>();
//		for(WebElement w:ls)
//		{
//			al.add(w.getText());
//			if(w.getText().equalsIgnoreCase("ANDORRA"))
//			{
//				w.click();
//			}
//		}

		
//		Collections.sort(al);
//		System.out.print("After sorting " +al+ " ");
		//System.out.print("Before sorting " +al+ " ");
		
		
	}
	
	public static void dynamicDropdown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='country']"));
	    Select sc = new Select(dropdown);
	    String option=sc.getFirstSelectedOption().getText();
	    System.out.println(option);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver dvr=new ChromeDriver();
		dvr.get("http://demo.guru99.com/test/newtours/register.php");
		
		//dvr.get("https://www.spicejet.com/default.aspx");
		dvr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		dvr.manage().deleteAllCookies();
		dvr.manage().window().maximize();
		
		System.out.println("Current URL is "+dvr.getCurrentUrl());
		System.out.println("Title is "+dvr.getTitle());
		
		//DropDown(dvr);
		
		dynamicDropdown(dvr);
		
		

	}

}
