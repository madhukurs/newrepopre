package curdWithBDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenricUtility.JavaUtility;

import io.restassured.http.ContentType;

public class putproject {
	

		JavaUtility ran = new JavaUtility();
		@Test
		public void addproject() {

			
			JSONObject jsonparameter = new JSONObject();
			jsonparameter.put("createdBy", "madhu_SDET40");
			jsonparameter.put("projectName", "hrmnew" +ran.getrandomnumbermethod(100));
			jsonparameter.put("status", "under progress");
			jsonparameter.put("teamSize", 20);

			// pre-condition
			given()
			.body(jsonparameter)
			.contentType(ContentType.JSON)

			// type of request send 
			.when()
			.post("http://rmgtestingserver:8084/addProject")

			// validate the response			
			.then()
			.statusCode(201)
			.log().all();

		}
		

}
