package frame.copy;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class Basecopy {

	@BeforeClass
	public void setup() {
		RestAssured.authentication=RestAssured.preemptive().basic("postman", "password");
		RestAssured.baseURI="https://postman-echo.com/basic-auth";
	}
}
