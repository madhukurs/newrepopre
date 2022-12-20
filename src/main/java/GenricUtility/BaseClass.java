package GenricUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static  io.restassured.RestAssured.*;

public class BaseClass {
	
	public Databaseutility db=new Databaseutility ();
	public ResrAssuredLibrary rest = new ResrAssuredLibrary();
	public JavaUtility jav= new JavaUtility();
	
	@BeforeSuite
	public void databasecongfig() throws SQLException
	{
		db.opendbconnection();
		baseURI="http://rmgtestingserver";
		port=8084;
		
	}

	@AfterSuite
	public void databasecloseconfig() throws SQLException
	{
		db.closingdb();
	}
}
