package validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseVal {


	@Test
	public void staticrespon()
	{
		String expdata="TY_PROJ_1021";
		baseURI="http://rmgtestingserver/";
		port=8084;

		Response resp = given().get("/projects");
		String  actdata = resp.jsonPath().get("[3].projectId");
		Assert.assertEquals(actdata, expdata);
		System.out.println("data verified");
		resp.then().log().all();


	}
}
