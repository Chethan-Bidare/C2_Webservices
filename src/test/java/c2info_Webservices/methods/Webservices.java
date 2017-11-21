package c2info_Webservices.methods;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class Webservices {
	
	public static Response Post(String uRI,String stringJSON){
		RequestSpecification requestspecification = RestAssured.given().body(stringJSON);
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.post(uRI);
		return response ;
	}
	
	public static Response Get(String uRI){
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.get(uRI);
		return response ;
		
	}
	
	public static Response Put(String uRI,String stringJSON){
		RequestSpecification requestspecification = RestAssured.given().body(stringJSON);
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.put(uRI);
		return response ;
	}
	
	public static Response Delete(String uRI){
		RequestSpecification requestspecification = RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response = requestspecification.put(uRI);
		return response ;
	}

}
