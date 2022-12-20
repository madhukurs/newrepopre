package curdWithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class PatchUpdate {
	


	
	@Test
	public void  patchupdateprojects()
	{
		
		JSONObject js=new JSONObject();
		js.put("createdBy", "madhu_SDET40 new");
		js.put("projectName", "hrmnew project " );
		js.put("status", "closed");
		js.put("teamSize", 20);

		
		
		
		given()
		.body(js)
		
		.contentType(ContentType.JSON)

		// type of request send 
		.when()
		.put("http://rmgtestingserver:8084/projects/TY_PROJ_4949")

		// validate the response			
		.then()
		.statusCode(200)
		.log().all();
	}

}
