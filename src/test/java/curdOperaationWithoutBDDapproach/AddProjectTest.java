package curdOperaationWithoutBDDapproach;



	import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

	public class AddProjectTest {
		@Test
		public void addProjectTest() {
			//used to create json object-use json.simple tool
			JSONObject jobj=new JSONObject();
			//POST http method-->to create the body
			jobj.put("createdBy", "Madhu123455");
			jobj.put("projectName", "Rmgyantra-tyss2355554");
			jobj.put("status", "created12");
			jobj.put("teamSize", 50156);
			//preconditions(features of request-format in which we have to send)
			RequestSpecification reqSpec = RestAssured.given();
			reqSpec.body(jobj);
			reqSpec.contentType(ContentType.JSON);
			//actions(fetch the content from response)
			Response response = reqSpec.post("http://rmgtestingserver:8084/addProject");
			//validation(validate using-then)
			response.getContentType();
			ValidatableResponse valResponse = response.then();
			valResponse.assertThat().contentType(ContentType.JSON);
			valResponse.assertThat().statusCode(201);
			//print everything
			valResponse.log().all();
			//status line-1st line inside console[http/1/1 201]
		}
		//3 layer testing we can use assertion from testNg
		@Test(enabled=true)
		public void getProject()
		{
			RequestSpecification reqSpecass = RestAssured.given();
			Response response1 = reqSpecass.get("http://rmgtestingserver:8084/projects/TY_PROJ_3846");
			response1.getContentType();
		  ValidatableResponse validateresponce = response1.then();
		  validateresponce.assertThat().contentType(ContentType.JSON);
		  validateresponce.assertThat().statusCode(200);
		 // validateresponce.log().all();
		  
		  
		}
		@Test(enabled=false)
		public void putProject()
		{
			JSONObject js=new JSONObject();
			js.put("createdBy", "Madhu123456789");
			js.put("projectName", "Rmgyantra-tyss23412345");
			js.put("status", "complete");
			js.put("teamSize", 1000);
			
			RequestSpecification reqSpec23 = RestAssured.given();
			reqSpec23.body(js);
			reqSpec23.contentType(ContentType.JSON);
			Response putresponse = reqSpec23.put("http://rmgtestingserver:8084/projects/TY_PROJ_3846");
			putresponse.contentType();
			ValidatableResponse putvalidate = putresponse.then();
			putvalidate.assertThat().contentType(ContentType.JSON);
			putvalidate.assertThat().statusCode(200);
			putvalidate.log().all();
			
		}
		

		

	}


