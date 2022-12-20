package seralisationAndDrseralisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassforParse.EmployeeDetailsWithArray;

public class SerilisationOFEmplloyeewirhArray {
	
	
	
	
	@Test
	public void emparray() throws JsonGenerationException, JsonMappingException, IOException
	{
	long[] num= {9741694407l,9964508569l};
	String[] mail= {"madhukurs@gmail.com","urs.manuk@gmail.com"};
	
	
	EmployeeDetailsWithArray empi=new EmployeeDetailsWithArray("manu","emop90",num,"maddur",250000,mail);
    
	ObjectMapper obje= new ObjectMapper();
	
	obje.writeValue(new File("empdetailssarray.json"), empi);
	}
}
