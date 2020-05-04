package com.Start.Post;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



import static io.restassured.RestAssured.*;

public class Test01_Post {
	
/*	@Test
	public void test1_post()
	{
	//	https://reqres.in/api/users
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("name","Megha");
		map.put("job", "ITA");
		System.out.println(map);
		JSONObject request= new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		
	} */
	
	@Test
	public void test2_post()
	{
		JSONObject request1= new JSONObject();
		request1.put("name", "Rudra");
		request1.put("qualification", "B.E.");
		System.out.println(request1.toJSONString());
		given().
				header("Content-Type","application/json").
				body(request1.toJSONString()).
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
		when().
				post("https://reqres.in/api/users").
		then().
				statusCode(201);
		
	}

}
