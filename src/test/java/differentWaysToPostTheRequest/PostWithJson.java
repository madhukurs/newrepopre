package differentWaysToPostTheRequest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostWithJson {

	@Test
	public void file()
	{
	//baseURI="http://rmgtestingserver/";
	//=8084;
	{
		//String file="/RestAssured/post.json";
		File fil = new File("C:\\Users\\madhu\\eclipse-workspace\\RestAssured\\post.json");
		given()
		.body(fil)
		.contentType(ContentType.JSON)
		 
	     .when()
	     .post("http://rmgtestingserver:8084/addProject")
	     
	     .then()
	     .assertThat().statusCode(201)
	     .log().all();
	}
	
	
	
	
}
}
