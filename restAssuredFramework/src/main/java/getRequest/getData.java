package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class getData {

	@Test
	public  void testResposecode() {
		
		int code= get("http://restapi.demoqa.com/utilities/weatherfull/city/Hyderabad").getStatusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code,200);
	}

	@Test
	public  void testResposebody() {
		
		String data=get("http://restapi.demoqa.com/utilities/weatherfull/city/Hyderabad").asString();
				System.out.println(data);
	}
}
