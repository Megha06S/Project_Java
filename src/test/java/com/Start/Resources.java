package com.Start;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class Resources {
	public static JsonPath postData(Response res)
	{
		String resp=res.asString();
		//System.out.println(resp);
		JsonPath x=new JsonPath(resp);
		return x;
	}
	
	public static String body_res()
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
		return b;
	}

	public static XmlPath postXMLData(Response res)
	{
		String resp=res.asString();
		System.out.println(resp);
		XmlPath x=new XmlPath(resp);
		return x;
	}

}
