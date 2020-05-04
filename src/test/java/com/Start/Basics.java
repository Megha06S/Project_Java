package com.Start;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONArray;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class Basics {
//	//GET REQUEST
//	@Test
//	void test_01()
//	{
//		RestAssured.baseURI ="https://maps.googleapis.com/";
//		
//		given().
//				param("location", "-33.8670522,151.1957362").
//				param("radius", "500").
//				param("key","AIzaSyBZIvtgKIOgIUdd0m0Qu5PuHdJxmsLpIOI").
//		when().
//				get("maps/api/place/nearbysearch/json").
//		then().
//				assertThat().
//				statusCode(200).log().all();//and().body("results[0].geometry.name",equalTo("Sydney"));
//				//body("results[0].geometry.location.lat",equalTo("-33.86882"));
//				
//				
//	}
	//POST REQUEST
//	@Test
//	void test_02()
//	{
//		
////		String b ="{"+
////
////    "\"location\":{"+
////
////        "\"lat\" : -38.383494,"+
////
////        "\"lng\" : 33.427362"+
////
////    "},"+
////
////    "\"accuracy\":50,"+
////
////    "\"name\":\"Frontline house\","+
////
////    "\"phone_number\":\"(+91) 983 893 3937\","+
////
////    "\"address\" : \"29, side layout, cohen 09\","+
////
////    "\"types\": [\"shoe park\",\"shop\"],"+
////
////    "\"website\" : \"http://google.com\","+
////
////    "\"language\" : \"French-IN\""+
////
////"}]";
//
//		RestAssured.baseURI ="https://maps.googleapis.com";
//		
//		given().
//				queryParam("key","AIzaSyBZIvtgKIOgIUdd0m0Qu5PuHdJxmsLpIOI").
//				body("{"+
//
//    "\"location\":{"+
//
//        "\"lat\" : -38.383494,"+
//
//        "\"lng\" : 33.427362"+
//
//    "},"+
//
//    "\"accuracy\":50,"+
//
//    "\"name\":\"Frontline house\","+
//
//    "\"phone_number\":\"(+91) 983 893 3937\","+
//
//    "\"address\" : \"29, side layout, cohen 09\","+
//
//    "\"types\": [\"shoe park\",\"shop\"],"+
//
//    "\"website\" : \"http://google.com\","+
//
//    "\"language\" : \"French-IN\""+
//
//"}").
//				
//		when().
//			post("/maps/api/place/add/json").
//		then().
//			assertThat().
//			statusCode(200).and().contentType(ContentType.JSON).and().
//		body("status",equalTo("200")).log().all();
//	}
	
	//DELETE REQUEST
	
	@Test
	void test_03()
	{

		   String b= "{"+"\"location\":{"+

		        "\"lat\" : -38.383494,"+

		        "\"lng\" : 33.427362"+

		    "},"+

		    "\"accuracy\":50,"+

		    "\"name\":\"Frontline house\","+

		    "\"phone_number\":\"(+91) 983 893 3937\","+

		    "\"address\" : \"29, side layout, cohen 09\","+

		    "\"types\": [\"shoe park\",\"shop\"],"+

		    "\"website\" : \"http://216.10.245.166\","+

		    "\"language\" : \"French-IN\""+

		"}";
		RestAssured.baseURI ="http://216.10.245.166";
		
		given().
				queryParam("key","qaclick123").
				body(b).

				
		when().
			post("/maps/api/place/add/json").
		then().
			assertThat().
			statusCode(200).and().contentType(ContentType.JSON).and().
		body("status",equalTo("OK")).log().all();
	}

}
