package Verfone.UiFramework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class techList {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30000));
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Megha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
		
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/08/2022");
		
		driver.findElement(By.xpath("//input[@id='profession-0']")).click();
		
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();

		List<WebElement> ele=driver.findElements(By.xpath("//select[@class='input-xlarge']"));
		
		System.out.println(ele.size());
		
		ArrayList<String> al=new ArrayList<>();
		
		for(WebElement e:ele)
		{
			al.add(e.getText());
			
		}
		
		
//		System.out.println("Before sorting "+al);
//		
//		
//		
//		Collections.sort(al);
//		System.out.println("After sorting "+ al);
		
//		WebElement ele= driver.findElement(By.xpath("//select[@class='input-xlarge']"));
//		
//		Select s=new Select(ele);
//		//s.selectByVisibleText("Europe");
//		s.selectByIndex(3);
//		
//		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("D:\\abc.txt");
//		

		

	}

}
