package com.AddBook;
import com.Start.Resources;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Advance {
	Properties prop= new Properties();
	
//	@BeforeTest
//	public void getData() throws Exception
//	{
//		
//		FileInputStream fis= new FileInputStream("D:\\Automation\\AutomationD\\Fresh\\src\\test\\resources\\com\\Files\\env.properties");
//		prop.load(fis);
//		System.out.println(prop.get("HOST"));
//	}
	
	@Test
	void AddBook()
	{
		  
		RestAssured.baseURI ="http://216.10.245.166";
		
	Response res= 	given().header("Content-Type","application/json"). 
				body("{\r\n\r\n\"name\":\"Learn Appium Automation with Java\",\r\n\"isbn\":\"abcdef\",\r\n\"aisle\":\"225\",\r\n\"author\":\"John foe\"\r\n}\r\n").
				when().
			post("/Library/Addbook.php").
		then().
			assertThat().
			statusCode(200).and(). 
		extract().response();
	
	  JsonPath js= Resources.postData(res);
	  String id = js.get("ID");
	  System.out.println(id);
		
		
 
		
}
}
