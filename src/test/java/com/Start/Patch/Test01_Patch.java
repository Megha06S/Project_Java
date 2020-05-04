package com.Start.Patch;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;



import static io.restassured.RestAssured.*;

public class Test01_Patch {
	


		@Test
		public void test01_patch()
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
				patch("https://reqres.in/api/users/2").
			then().
				statusCode(200).log().all();
		}



}
