package dataProvider;

import genricUtility.ExcelData;
import genricUtility.RandomNumber;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pojoClassForAddingProject.CreatingProject;

public class dataproviderUsingExcel {
	@Test(dataProvider = "da")
	  
	
	public void data(String createdBy,String projectName,String status,int teamSize)
	{
		RandomNumber ran = new RandomNumber();
	
	      CreatingProject cr = new CreatingProject( createdBy, projectName+ran.Randomnum(), status,teamSize);
	     given()
	     .body(cr)
	     .contentType(ContentType.JSON)
	     .when()
	     .put("http://rmgtestingserver:8084/addProject")
	     .then()
	     .assertThat().statusCode(201).log().all();
	     
	}
	@DataProvider(name="da")

	public Object[][] dataimp() throws EncryptedDocumentException, IOException
	{
		ExcelData ex = new ExcelData();
		Object[][] obj = new Object[2][4];
		obj[0][0]=ex.excel("Sheet1", 0,1);
		obj[0][1]=ex.excel("Sheet1", 1,1);
		obj[0][2]=ex.excel("Sheet1", 2,1);
		obj[0][3]=ex.excel("Sheet1", 3,1);
		
		
		obj[1][0]=ex.excel("Sheet1", 0,2);
		obj[1][1]=ex.excel("Sheet1", 1,2);
		obj[1][2]=ex.excel("Sheet1", 2,2);
		obj[1][3]=ex.excel("Sheet1", 3,2); 
		
		return obj;
		
	}

}
