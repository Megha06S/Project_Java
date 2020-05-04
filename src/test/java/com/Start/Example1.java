package com.Start;
import org.apache.commons.lang3.Validate;
import org.apache.http.protocol.HTTP;
import static io.restassured.config.RestAssuredConfig.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Example1 {
	
/*	@Test
	public void test_Get()
	{
		baseURI = "http://localhost:3000/";
		given().
			param("name","Automation").
			get("/subjects").
			then().
			statusCode(200).
			log().all();
	}*/
	
/*	@Test
	public void Post()
	{
		//RestAssured.config = RestAssured.config().encoderConfig(encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));

		JSONObject request= new JSONObject();
		request.put("firstName", "Aditya");
		request.put("lastName", "Kaushik");
		request.put("subjectId",5);
		
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:3000/";
			given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("Content-Type", "application/json").
			when().
				post("/users").
			then().
			statusCode(201).
			log().all();
	}
*/
	
/*	@Test
	public void test_patch()
	{
		//RestAssured.config = RestAssured.config().encoderConfig(encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false));

		JSONObject request= new JSONObject();
	
		request.put("lastName", "Aditya");
		
		
		System.out.println(request.toJSONString());
		
		baseURI = "http://localhost:3000/";
			given().
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
				header("Content-Type", "application/json").
			when().
				patch("/users?Id=1").
			then().
			statusCode(201).
			log().all();
	}*/
	@Test
	public void test_delete()
	{
		
		
		
		baseURI = "http://localhost:3000/";
//			given().
//				contentType(ContentType.JSON).
//				accept(ContentType.JSON).
//				header("Content-Type", "application/json").
			when().
				delete("/users?Id=1").
			then().
			statusCode(200).
			log().all();
	}

	

}
