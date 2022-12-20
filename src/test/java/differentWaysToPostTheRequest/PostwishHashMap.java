package differentWaysToPostTheRequest;



import java.util.HashMap;

import org.testng.annotations.Test;

import genricUtility.RandomNumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostwishHashMap{
	@Test
	public void request() {

		RandomNumber ran = new RandomNumber();
		HashMap<String, Object> map = new HashMap<String,Object>();
		map.put("createdBy", "Madhu");
		map.put("projectName", "name_of_project_no_is :-" +ran.Randomnum());
		map.put("status", "completed project");
		map.put("teamSize", ran.Randomnum());

		RestAssured
		.given()
		.body(map).contentType(ContentType.JSON)

		.when()
		.post("http://rmgtestingserver:8084/addProject")

		.then()
		.statusCode(500)
		.assertThat().statusLine("HTTP/1.1 500 ")

		.log().all();



	}


}


