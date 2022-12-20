package pojoClassforParse;

public class EmployeeDetailsWithObject {

	String name;
	String id;
	long phonenum;
	String address;
	String mailid;
	Object spouse;

	public EmployeeDetailsWithObject(String name, String id, long phonenum, String address,String mailid,Object spouse) {
		
		this.name = name;
		this.id = id;
		this.phonenum = phonenum;
		this.address = address;
		this.mailid=mailid;
		this.spouse=spouse;
		
		
	}
	public EmployeeDetailsWithObject()
	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getmailid()
	{
		return mailid;
	}
	
	public void setmailid(String mailid)
	{
		this.mailid=mailid;
	}
	
	public Object getspouse() {
		return spouse;
	}
	public void setspouse() {
		this.spouse=spouse;
	}
}


