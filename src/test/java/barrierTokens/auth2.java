package barrierTokens;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class auth2 {
	
	@Test
	public void authTest() {
	Response resp = given()
	 .formParam("client_id", "sachin")
	 .formParam("client_secret", "ef65943ed5dba9cae21679397ceaaad5")
	 .formParam("grant_type", "client_credentials")
	 .formParam("redirect_uri", "http://example.com")
	 .formParam("code", "authorization_code")
	 
	 .when().post("http://coop.apps.symfonycasts.com/token");
	String token=resp.jsonPath().get("access_token");
	System.out.println(token);
	
	given().auth().oauth2(token)
	.when().post("http://coop.apps.symfonycasts.com/api/4035/toiletseat-down")
	.then().assertThat().log().all();
	
	}

}
