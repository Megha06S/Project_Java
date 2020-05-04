package com.Start.Delete;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test01_Delete {
	
	@Test
	public void delete()
	{
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).log().all();
	}


}
