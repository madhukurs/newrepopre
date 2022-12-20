package curdWithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenricUtility.JavaUtility;

import io.restassured.http.ContentType;

public class GetAllProjects {
	
	
	JavaUtility ran = new JavaUtility();
	@Test
	public void addproject() {

		
		
		// pre-condition
		given()
		
		.contentType(ContentType.JSON)

		// type of request send 
		.when()
		.get("http://rmgtestingserver:8084/projects")

		// validate the response			
		.then()
		.statusCode(200)
		.log().all();

	}
	

}
