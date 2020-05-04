package com.Advance;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.Start.Resources;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ParseJSON {

	@Test
	void test_01()
	{
		RestAssured.baseURI ="https://maps.googleapis.com/";
		
		Response res=given().
				param("location", "-33.8670522,151.1957362").
				param("radius", "500").
				param("key","AIzaSyBZIvtgKIOgIUdd0m0Qu5PuHdJxmsLpIOI").
		when().
				get("maps/api/place/nearbysearch/json").
		then().
				assertThat().
				statusCode(200).and().contentType(ContentType.JSON).extract().response();
		
		JsonPath js=Resources.postData(res);
		//System.out.println();
		int count=js.get("results.size()");
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println(js.get("results["+i+"].name"));
			
		}
			System.out.println(count);
				
				
	}
}
