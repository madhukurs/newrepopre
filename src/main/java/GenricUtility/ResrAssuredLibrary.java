package GenricUtility;

import io.restassured.response.Response;

public class ResrAssuredLibrary {
	public String getjsondata(Response respon,String path)
	{
		 String jsonObject=respon.jsonPath().get(path);
		 return jsonObject;
	}

}
