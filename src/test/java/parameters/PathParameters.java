package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

//import io.restassured.RestAssured;

//import static io.restassured.RestAssured.*;

public class PathParameters {
	
	@Test
	public void para()
	{
		baseURI="http://rmgtestingserver/";
		port=8084;
		
        given()
        .pathParam("pid", "TY_PROJ_5533")
        .when().get("/projects/{pid}")
        .then().assertThat().statusCode(200)
        .log().all();

		
		
	}

	
}
