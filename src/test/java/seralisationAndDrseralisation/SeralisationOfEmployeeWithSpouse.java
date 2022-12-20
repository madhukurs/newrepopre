package seralisationAndDrseralisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforParse.EmployeeDetailsWithObject;
import pojoClassforParse.SpouseDetails;

public class SeralisationOfEmployeeWithSpouse {

	@Test
	public void empwithspouse() throws JsonGenerationException, JsonMappingException, IOException
	{
		SpouseDetails sps=new SpouseDetails("invalid",9964502869l);
		EmployeeDetailsWithObject emp = new EmployeeDetailsWithObject(" madhu","emp21",9741694407l,"mandya","madhukurs@gmail.com",sps);
		ObjectMapper obje= new ObjectMapper();

		obje.writeValue(new File("empdetailspouse.json"), emp);
	}
}
