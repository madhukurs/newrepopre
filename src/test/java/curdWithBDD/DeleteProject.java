package curdWithBDD;

import static io.restassured.RestAssured.when;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

public class DeleteProject {

	
	public void delete()
	{
		when()
		.delete("http://rmgtestingserver:8084/projects/TY_PROJ_4483")


		.then()
		.statusCode(204)
		.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS)
		//.assertThat().contentType(C)

		.log()
		.all();
	}

	
}
