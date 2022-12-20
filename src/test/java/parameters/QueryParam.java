package parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParam {
	@Test
	public void query()
	{
		baseURI="https://reqres.in/";

		given()
		.queryParam("enduri", "page=2")
		.get("/api/users/?enduri")
		.then().assertThat().statusCode(200).log().all();
	}



}
