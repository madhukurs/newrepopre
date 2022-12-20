package parameters;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genricUtility.RandomNumber;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathUpdate {
	
	@Test
	public void pathPatchUpdates()
	{
		baseURI="http://rmgtestingserver/";
		port=8084;
		RandomNumber ran = new RandomNumber();
	     JSONObject js = new JSONObject();
	        js.put("createdBy", "madhu_SDET40");
			js.put("projectName", "hrmnew" +ran.Randomnum());
			js.put("status", "under progress");
			js.put("teamSize", 2000);
			
			given()
			.body(js)
			.contentType(ContentType.JSON)
			.pathParam("proid", "TY_PROJ_5547")
			.when()
			
			.put("/projects/{proid}")
			.then().assertThat().statusCode(200)
			.log().all();
			
			
			
			
			
	}

}
