package com.Advance;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import org.testng.annotations.Test;

import com.Start.Resources;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AdvanceXml {
	
	@Test
	void Add() throws IOException
	
	{
		String postData =GenerateStringFromResource("D:\\Automation\\postData.xml");
		Properties prop= new Properties();
		  
		RestAssured.baseURI ="http://216.10.245.166";
		given().
		queryParam("key","qaclick123").
		body(postData).
		when().
	post("/maps/api/places/add/xml").
then().
	assertThat().
	statusCode(200).and().contentType(ContentType.XML).and().
body("status",equalTo("OK")); 
		
//	Response res= 	given().
//				queryParam("key","qaclick123").
//				body(Resources.postXMLData()).
//				when().
//			post(Resources.postData()).
//		then().
//			assertThat().
//			statusCode(200).and().contentType(ContentType.XML).and().
//		body("status",equalTo("OK")).
//	 	extract().response();
	
//	String resp=res.asString();
//	System.out.println(resp);//Task 1: Grabbed the response
//	//Task 2: Grab the placeId from response
//	
//	  JsonPath js= new JsonPath(resp);//reads the string, converts it into json and the places the entire string into js (object)
//		String pId=js.get("place_id");
//		System.out.println(pId);
//		
//		//task 3 -Place the pid in delete request
//		
//		given().
//			queryParam("key",prop.getProperty("KEY")).
//			body("{"+
//			"\"place_id\":\""+pId+"\""+
//					"}").
//		when().
//			post("/maps/api/place/delete/json").
//		then().
//		assertThat().
//		statusCode(200).and().contentType(ContentType.XML).and().
//		body("status",equalTo("OK"));
//		System.out.println("Place id deleted");
		
 
		

}
	
	@Test
	public static String GenerateStringFromResource(String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));
	}


}
