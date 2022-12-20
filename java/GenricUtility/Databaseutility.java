package GenricUtility;

import java.sql.Array;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
/**
 * This class contains of methods to handle database operations
 * @author madhu
 *
 */
public class Databaseutility 
{
	// public List<String> empnames;
	
       Connection connection;
    /**
     * This method is used to fetch a complete column data from database   
     * @param query
     * @param columname
     * @return
     * @throws SQLException
     */
       
   public String getdatafromdatabase1(String query ,int columindex,String expdata)throws SQLException {
	   
	   boolean flag=false;
	Statement stm =connection. createStatement();
	ResultSet result = stm.executeQuery(query);
	while(result.next()) {
		if(result.getString(columindex).equalsIgnoreCase(expdata))
		{
			flag=true;
			break;
		}
		
	}
	if(flag) {
		System.out.println("verified");
		return expdata;
	}
	else {
		System.out.println("data not verified");
		return "";
	}
	

   }
   
   
   
   
   public void opendbconnection() throws SQLException
   {
	   Driver drii = new Driver();
	   DriverManager.registerDriver(drii);
	   connection=DriverManager.getConnection(IconstantPath.dburl, IconstantPath.dbusername, IconstantPath.dbpassword);
   }
   
   
	
   public void modifingdata(String query) throws SQLException
   {
	Statement s1 = connection.createStatement();
	s1.executeUpdate(query);
	
   }
   
   /**
    * 
    * @param query
    * @param columname
    * @param Excepteddata
    * @return
    * @throws SQLException
    */
   
//   public boolean verifingdataindatabase(String query ,String columname,String Excepteddata) throws SQLException
//   {
//	 List<String>  list =getdatafromdatabase(query,columname);
//	 boolean flag=false;
//	 for(String actualData:list)
//	 {
//		 if(actualData.equalsIgnoreCase(Excepteddata));
//		 {
//		     flag=true;
//		     break;
//		 }
//		 
//			 
//		 }
//	 return flag;
//	 }
//   
//   
 

  public void closingdb() throws SQLException
  {
 	connection.close();
  }
}