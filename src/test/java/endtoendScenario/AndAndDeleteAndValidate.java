package endtoendScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.endpointlibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import java.sql.SQLException;

import pojoClassForAddingProject.CreatingProject;

public class AndAndDeleteAndValidate extends BaseClass {
	@Test
	public void AddAndDelete() throws SQLException
	{
		CreatingProject cre= new CreatingProject("manoj","tyssnew12"+jav.getrandomnumbermethod(100),"pending",12);
		  
	  Response	res=given().body(cre).contentType(ContentType.JSON).when().post(endpointlibrary.creatProjects);
		
		String expdata=rest.getjsondata(res, "projectId");
		 System.out.println(expdata);

		 
		 
		 when().delete(endpointlibrary.deleteProjects+expdata);
		 
		 String query1="Select* from project;";
		 String actdata = db.getdatafromdatabase1(query1, 1, expdata);
		 Assert.assertNotSame(expdata, actdata);
		 System.out.println("tc is pass");
		 
		 res.then().log().all();
		 
		 
		 
	}
	

}
