package barrierTokens;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2new {

	@Test
	public void authTest() {
		Response resp = given()
				.formParam("client_id", "cookingforfood")
				.formParam("client_secret", "d9f3f40d6ff7e217f5dc2acf9174fccc")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "http://cookingforfood.com")
				.formParam("code", "authorization_code")

				.when().post("http://coop.apps.symfonycasts.com/token");
		String token=resp.jsonPath().get("access_token");
		System.out.println(token);

		given().auth().oauth2(token)
		.when().post("http://coop.apps.symfonycasts.com/api/4042/chickens-feed")
		.then().assertThat().log().all();

	}

}



