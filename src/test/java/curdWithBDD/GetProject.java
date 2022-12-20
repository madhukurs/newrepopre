package curdWithBDD;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;

public class GetProject {

	public void  getProject() {

		given()

		.contentType(ContentType.JSON)

		.when()
		.get("http://rmgtestingserver:8084/projects/TY_PROJ_4376")


		.then()
		.statusCode(200)
		.assertThat().time(Matchers.lessThan(20L),TimeUnit.MILLISECONDS)
		//.assertThat().contentType(C)

		.log()
		.all();




	}
	
}
