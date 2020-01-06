package getRequest;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import  io.restassured.RestAssured;

public class postEx {

	@Test
	public void post() {
		RequestSpecification request=  RestAssured.given();
		request.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("FirstName", "Kranthi2");
		json.put("LastName", "fdsfRajoraa");
		json.put("UserName", "harisddsfdfhrajoraa");
		json.put("Password", "1234sdfd56");
		json.put("Email", "sabcdfdddef@xyz.com");
		
		request.body(json.toJSONString());
		
		Response response =request.post("http://restapi.demoqa.com/customer/register");
		int code = response.getStatusCode();
		System.out.println(code);
		
	}
}
