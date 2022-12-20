package endtoendScenario;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.endpointlibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClassForAddingProject.CreatingProject;

public class CreatEUpdateAndValidate extends BaseClass{
	@Test
	public void AddAndDelete() throws SQLException
	{
		CreatingProject cre= new CreatingProject("kholi","tyssnew"+jav.getrandomnumbermethod(100),"complete",122);

		Response	res=given().body(cre).contentType(ContentType.JSON).when().post(endpointlibrary.creatProjects);

		String expdata=rest.getjsondata(res, "projectId");
		System.out.println(expdata);
		res.then().log().all();

		CreatingProject cr= new CreatingProject("yavraj","tyss"+jav.getrandomnumbermethod(100), "complete",152);
		Response resp =given().body(cr).contentType(ContentType.JSON)
				.when().put(endpointlibrary.updateProjects+expdata);
		String updatedata = rest.getjsondata(resp,"projectId");
		resp.then().log().all();



		String query ="Select* from project;";
		String actdata = db.getdatafromdatabase1(query, 1, expdata);
		Assert.assertEquals(updatedata,actdata );
		System.out.println("tc is passed");
		resp.then().log().all();


	}
}
