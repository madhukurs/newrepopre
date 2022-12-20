package parameters;


import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathDelete {

	
	@Test
	public void pathdelete()
	{

		baseURI="http://rmgtestingserver/";
		port=8084;
		
		given()
		.contentType(ContentType.JSON)
		.pathParam("Pathpa","TY_PROJ_5573")
		
		
		.when().delete("/projects/{Pathpa}")
		.then().assertThat().statusCode(204)
		.log().all();
		
		
		
		
		
	}
}
