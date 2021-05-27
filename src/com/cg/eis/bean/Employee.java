package com.cg.eis.bean;

public class Employee {
	int id;
	String name;
	int sal;
	String desig;
	String ins; 
	public Employee(int id, String name, int sal,String desig)
	{
		this.id =id;
		this.name = name;
		this.sal = sal;
		this.desig = desig;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getIns() {
		return ins;
	}
	public void setIns(String ins) {
		this.ins = ins;
	}
	public void print()
	{
		System.out.println("Id of employee = "+id);
		System.out.println("Name of employee = "+name);
        System.out.println("Salary of employee = "+sal);
        System.out.println("Desination of employee = "+desig);
        System.out.println("Insurance Scheme of employee = "+ins);
	}

}
