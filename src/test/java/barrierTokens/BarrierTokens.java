package barrierTokens;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class BarrierTokens {

	
		
		@Test
		public void bearerToken()
		{
			baseURI ="https://api.github.com";
			JSONObject jOb = new JSONObject();
			jOb.put("name", "testing_post_req");
			
			given()
			 .auth()
			 .oauth2("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")
			 .body(jOb)
			 .contentType(ContentType.JSON)
			 
		    .when()
		     .post("/user/repos")
		     
		    .then().statusCode(201).log().all();
	}
	
	
	
}
