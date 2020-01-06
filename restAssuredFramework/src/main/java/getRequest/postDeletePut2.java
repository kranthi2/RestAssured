package getRequest;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import  io.restassured.RestAssured;

public class postDeletePut2 {

	@Test
	public void post() {
		RequestSpecification request=  RestAssured.given();
	
		Response response =request.delete("http://localhost:3000/posts/2");
		int code = response.getStatusCode();
		System.out.println(code);
		
	}
}
