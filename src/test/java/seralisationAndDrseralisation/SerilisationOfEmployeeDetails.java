package seralisationAndDrseralisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforParse.EmployeeDetails;

public class SerilisationOfEmployeeDetails {
	@Test
	public void employmentdet() throws JsonGenerationException, JsonMappingException, IOException
	{
		//create object for pojo class
		EmployeeDetails emp=new EmployeeDetails(" madhu","emp21",9741694407l,"mandya","madhukurs@gmail.com");
		
		
		
		//Create the object for Object mapper
		ObjectMapper obj= new ObjectMapper();
		//write the values to json file
		
		obj.writeValue(new File("empdetails.json"), emp);
		
		
	}

}
