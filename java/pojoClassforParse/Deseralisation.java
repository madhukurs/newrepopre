package pojoClassforParse;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.deser.std.ObjectArrayDeserializer;
import org.testng.annotations.Test;

public class Deseralisation {
	@Test
	public void jasontojava() throws JsonParseException, JsonMappingException, IOException
	 {
		ObjectMapper emp=new ObjectMapper();
		
		EmployeeDetailsWithObject value = emp.readValue(new File("empdetailspouse.json"), EmployeeDetailsWithObject.class);
		System.out.println(value.getPhonenum());
	 }

	
	
}
