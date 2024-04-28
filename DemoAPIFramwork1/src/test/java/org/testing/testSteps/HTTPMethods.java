package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	Properties pr; //Global
	public HTTPMethods(Properties pr) {
		this.pr=pr;
		
	}
	
	public Response postMethod(String requestBody, String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uriValue);
		System.out.println("Status Code is :"+res.statusCode());
		
		return res;
		
	}
	
	public Response getAllMethod(String uriKeyName) {
		String uriValue = pr.getProperty(uriKeyName);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status Code is :"+res.statusCode());
		System.out.println("Response is: ");
		System.out.println(res.asPrettyString());
		return res;
	
	}
	
	public void getParticularMethod(String uriKeyName, String endPoint) {
		String uriValue = pr.getProperty(uriKeyName)+"/"+endPoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status Code is :"+res.statusCode());
		System.out.println("Response is: ");
		System.out.println(res.asPrettyString());
		
	}
	public void getParticularMethodInt(String uriKeyName, Integer endPoint) {
		String uriValue = pr.getProperty(uriKeyName)+"/"+endPoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("Status Code is :"+res.statusCode());
		System.out.println("Response is: ");
		System.out.println(res.asPrettyString());
		
	}
	
	public void putMethod(String requestBody, String uriKeyName, String endPoint) {
		String uriValue = pr.getProperty(uriKeyName)+"/"+endPoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.put(uriValue);
		System.out.println("Status Code is :"+res.statusCode());
	
	}
	
	public void deleteParticularMethod(String uriKeyName, String endPoint) {
		String uriValue = pr.getProperty(uriKeyName)+"/"+endPoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uriValue);
		System.out.println("Status Code is :"+res.statusCode());
		System.out.println("Response is: ");
		System.out.println(res.asString());
		
	}

}
