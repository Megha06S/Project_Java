package Verfone.UiFramework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		
//		WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'click the button')]"));
//		ele.click();
//		
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
		WebElement Alt2=driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(3000);
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.)
		
		
		
		Alert altNew=driver.switchTo().alert();
		System.out.println(altNew.getText());
		altNew.dismiss();
		driver.quit();
		
	}

}
