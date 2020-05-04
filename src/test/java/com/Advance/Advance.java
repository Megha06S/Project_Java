package com.Advance;
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
	void AddAndDelete()
	{
		  
		RestAssured.baseURI ="http://216.10.245.166";
		
	Response res= 	given().
				queryParam("key","qaclick123").
				body(Resources.body_res()).
				when().
			post("/maps/api/place/add/json").
		then().
			assertThat().
			statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")). 
		extract().response();
	
	String resp=res.asString();
	System.out.println(resp);//Task 1: Grabbed the response
	//Task 2: Grab the placeId from response
	
	  JsonPath js= new JsonPath(resp);//reads the string, converts it into json and the places the entire string into js (object)
		String pId=js.get("place_id");
		System.out.println(pId);
		
		//task 3 -Place the pid in delete request
		
		given().
			queryParam("key",prop.getProperty("KEY")).
			body("{"+
			"\"place_id\":\""+pId+"\""+
					"}").
		when().
			post("/maps/api/place/delete/json").
		then().
		assertThat().
		statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK"));
		System.out.println("Place id deleted");
		
 
		
}
}
