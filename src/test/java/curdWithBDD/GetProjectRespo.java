package curdWithBDD;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class GetProjectRespo {
	


	@Test
	public void addproject() {

		
		
		// pre-condition
		given()
		
		.contentType(ContentType.JSON)

		// type of request send 
		.when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_5861")

		// validate the response			
		.then()
		.statusCode(200)
		.log().all();


}
}
