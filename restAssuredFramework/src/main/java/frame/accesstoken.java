package frame;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class accesstoken {

	@Test
	public void token() {
		RestAssured.authentication=RestAssured.preemptive().basic("rR3fgoerIdspbwL4", "7IZOkCsdP1X5B4nF58IPG0Db4o32JrTb");
		
		Response resp =RestAssured.given()
		.formParam("grant_type", "client_credentials")
		.formParam("username", "security")
		.formParam("password", "abc@12345")
		.post("https://accounts.beta-wspbx.com/auth/token");

	System.out.println(resp.jsonPath().prettify());
	String token= resp.jsonPath().get("access_token");
	
	
	Response resp1=RestAssured.given()
			.auth().oauth2(token)
			.get("https://api.beta-wspbx.com/api/v1/account/18189/user/kranthi/agents-info");
	
	System.out.println(resp1.getBody().jsonPath().prettify());
	Assert.assertEquals(resp1.getStatusCode(), 200);
	}

	
}