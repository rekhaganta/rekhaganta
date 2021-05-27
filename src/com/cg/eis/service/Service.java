package com.cg.eis.service;

import com.cg.eis.bean.Employee;
interface EmployeeService
{
	public int insuranceScheme();
}
public class Service implements EmployeeService {
    String ins;
	public int insuranceScheme()
	{
		return 0 ;
	}
	
	public String insuranceScheme(int sal, String desig)
	{
		if(sal>5000 && sal<=20000 && desig.equals("system associate"))
		{
			ins = "Scheme C";
		}
		else if(sal>=20000 && sal<40000 && desig.equals("programmer"))
		{
			ins = "Scheme B";
		}
		else if(sal>=40000 && desig.equals("manager"))
		{
			ins = "Scheme A";
		}
		else
		{
			ins = "No Scheme";
		}
		return ins;
	}
}

