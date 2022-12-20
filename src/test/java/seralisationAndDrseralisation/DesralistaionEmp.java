package seralisationAndDrseralisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforParse.EmployeeDetails;

public class DesralistaionEmp {
	@Test
	
	public void jasontojavaarray() throws JsonParseException, JsonMappingException, IOException
	 {
		
		ObjectMapper emp=new ObjectMapper();
		
		EmployeeDetails value = emp.readValue(new File("empdeatils.json"), EmployeeDetails.class);
		System.out.println(value.getmailid());
	 }


}
