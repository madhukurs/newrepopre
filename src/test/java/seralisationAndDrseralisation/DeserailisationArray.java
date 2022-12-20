package seralisationAndDrseralisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforParse.EmployeeDetailsWithArray;
import pojoClassforParse.EmployeeDetailsWithObject;

public class DeserailisationArray {
	@Test
	public void jasontojavaarray() throws JsonParseException, JsonMappingException, IOException
	 {
		
		ObjectMapper emp=new ObjectMapper();
		
		EmployeeDetailsWithArray value = emp.readValue(new File("empdetailssarray.json"), EmployeeDetailsWithArray.class);
		System.out.println(value.getAddress());
	 }

}
