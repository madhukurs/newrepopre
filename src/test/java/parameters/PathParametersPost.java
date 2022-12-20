package parameters;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genricUtility.RandomNumber;
import io.restassured.http.ContentType;

import  static  io.restassured.RestAssured.*;

public class PathParametersPost {
	@Test
	public void pathPost()
	{
		
		
		baseURI="http://rmgtestingserver/";
		port=8084;
		RandomNumber ran = new RandomNumber();
		JSONObject js = new JSONObject();
		js.put("createdBy", "madhu_SDET40");
		js.put("projectName", "hrmnew" +ran.Randomnum());
		js.put("status", "under progress");
		js.put("teamSize", 20);
		
		
		given()
		.body(js)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		.then().assertThat().statusCode(201)	
		.log().all();
		
		
	}

}
