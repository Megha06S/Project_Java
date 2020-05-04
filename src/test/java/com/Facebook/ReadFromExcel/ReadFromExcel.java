package com.Facebook.ReadFromExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadFromExcel extends BaseClass{
	
	@Test
	public void InputToFB() throws Exception
	{
		BaseClass.ReadFromExcel();
		driver= new FirefoxDriver();
		driver .get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(BaseClass.id);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	}

}
