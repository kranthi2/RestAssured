package getRequest;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import  io.restassured.RestAssured;

public class postDeletePut3 {

	@Test
	public void post() {
		RequestSpecification request=  RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		json.put("id", "4");
		json.put("title", "rest");
		json.put("author", "AKAKAAK");
		
		request.body(json.toJSONString());
		
		Response response =request.put("http://localhost:3000/posts/4");
		int code = response.getStatusCode();
		System.out.println(code);
		
	}
}
