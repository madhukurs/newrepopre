package typeOfRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest {

@Test
public void getassure()
{
	
	RestAssured.baseURI="https://reqres.in/api/users?page=2";
}
	
}
