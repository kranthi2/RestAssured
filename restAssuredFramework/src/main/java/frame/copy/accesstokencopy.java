package frame.copy;

import static io.restassured.RestAssured.get;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class accesstokencopy extends Basecopy{

	@Test
	public void token() {
		RequestSpecification request=  RestAssured.given();
		request.header("Content-Type", "application/json");

		
		String data=RestAssured.given().get().asString();
		System.out.println(data);
	}
}