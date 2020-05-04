package com.Start.Put;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



import static io.restassured.RestAssured.*;

public class Test01_Put {

	@Test
	public void test01_put()
	{
		JSONObject request= new JSONObject();
		request.put("name", "Singh");
		request.put("job", "IT");
		
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).log().all();
	}
}
