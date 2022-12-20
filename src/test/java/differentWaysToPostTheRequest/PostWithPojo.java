package differentWaysToPostTheRequest;

import org.testng.annotations.Test;

import genricUtility.RandomNumber;
import io.restassured.http.ContentType;
import pojoClassForAddingProject.CreatingProject;

import static io.restassured.RestAssured.*;
import pojoClassforParse.EmployeeDetails;

public class PostWithPojo {
	
	@Test
	public void postpojo() {
		baseURI="http://rmgtestingserver/";
		port=8084;
		RandomNumber ran =new RandomNumber();
		CreatingProject cr=new CreatingProject("mad", "mad"+ran.Randomnum(),"com", 10);
		
		given()
		.body(cr).contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		.then().assertThat().statusCode(201).log().all();
		
		
	}

}
