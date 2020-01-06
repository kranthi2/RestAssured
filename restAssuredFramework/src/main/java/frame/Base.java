package frame;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class Base {

	@BeforeClass
	public void setup() {
		RestAssured.authentication=RestAssured.preemptive().basic("rR3fgoerIdspbwL4", "7IZOkCsdP1X5B4nF58IPG0Db4o32JrTb");
		RestAssured.baseURI="https://accounts.beta-wspbx.com/auth/token";
	}
}
