package pojoClassforParse;

public class EmployeeDetailsWithArray {
	String name;
	String id;
	long[] phonenum;
	String address;
	String[] mailid;
	int salary;
	
	public EmployeeDetailsWithArray(String name, String id, long[] phonenum, String address,int salary, String[] mailid) {
	
		this.name = name;
		this.id = id;
		this.phonenum = phonenum;
		this.address = address;
		this.mailid = mailid;
		this.salary=salary;
		
		
	}
	public EmployeeDetailsWithArray()
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
	public long[] getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(long[] phonenum) {
		this.phonenum = phonenum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getMailid() {
		return mailid;
	}
	public void setMailid(String[] mailid) {
		this.mailid = mailid;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	

}
