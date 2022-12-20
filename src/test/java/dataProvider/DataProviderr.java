package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genricUtility.ExcelData;
import genricUtility.RandomNumber;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import pojoClassForAddingProject.CreatingProject;

public class DataProviderr {
	
	@Test(dataProvider = "getdataprovider")
	public void datatest(String createdBy,String projectName,String status,int teamSize)
	{
		RandomNumber ran = new RandomNumber();
		CreatingProject pro = new CreatingProject( createdBy, projectName+ran.Randomnum(), status,teamSize);
		
		
		 given()
		.body(pro)
		.contentType(ContentType.JSON)
		.when()
		.post("http://rmgtestingserver:8084/addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
		 
		 
	}
	@DataProvider(name="getdataprovider")
	
	@Test
	public Object[][] addingmultipledata(){
	Object[][] obj = new Object[2][4];
	
	
	obj[0][0]="madhuk";
	obj[0][1]="searchingjob";
	obj[0][2]="incomplete";
	obj[0][3]=23;
	

	obj[1][0]="prajwal s r";
	obj[1][1]="coaching";
	obj[1][2]="incomplete";
	obj[1][3]=3;
	
	return obj;
	}
	
	

}
