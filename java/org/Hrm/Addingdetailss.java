package org.Hrm;

public enum Addingdetailss  {
	
  EMPOS("employee_position"),EMPCON("employee_contact"),EMPSSS("employee_sss"),EMPTIN("employee_tin"),EMPHDMF("employee_hdmf_pagibig"),EMPQSIS("employee_gsis");
	 
private String  addingdetails;
private Addingdetailss(String addingdetails)
         	{
        	 this.addingdetails=addingdetails;
         	}

public String getdetails()
{
	return addingdetails.toString();
}
}

