package endtoendScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.endpointlibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import pojoClassForAddingProject.CreatingProject;

public class CreateProjectAndVerifyInDataBase extends BaseClass{
	@Test
	public void creatproject() throws SQLException
	{
		CreatingProject cr = new CreatingProject( "man", "ty", "done",100);
		
		
		Response resp = given().body(cr).contentType(ContentType.JSON)
		.when().post(endpointlibrary.creatProjects);
		 String expdata=rest.getjsondata(resp, "projectId");
		 System.out.println(expdata);
		 
		 
		 
		 String query ="Select* from project;";
		 String actdata =db.getdatafromdatabase1(query, 1, expdata);
		 
		 
		 
		 Assert.assertEquals(expdata, actdata);
		 System.out.println("TC is pass");
		 
		 resp.then().log().all();
		
		
		
		
		
	}

}
