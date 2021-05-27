package com.cg.eis.pl;

//import java.security.Provider.Service;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;

//import com.cg.eis.bean.Employee;
//import java.util.*;
//import com.cg.eis.service.Service;	

import com.cg.eis.bean.Employee;
import java.util.*;
import com.cg.eis.service.Service;	


//import com.cg.eis.bean.Employee;

public class Main {
	public static void main(String[] args) {
		Service s = new Service();
		Scanner in = new Scanner (System.in);
		int id, sal;
		String name,desig,ins;
		System.out.print("enter insurance scheme = "); 
		ins = in.nextLine();
		HashMap<String, Employee> hm = new HashMap<String,Employee>();
		hm.put("Scheme A", new Employee(1,"Sathish",50000,"manager"));
		hm.put("Scheme B", new Employee(10,"Charan",30000,"system associate"));
		hm.put("Scheme C", new Employee(15,"Likhitha",15000,"analyst"));
		hm.put("No Scheme", new Employee(19,"Sushmitha",5000,"clerk"));
		Set s1 = hm.entrySet();
		Iterator i = s1.iterator();
		while(i.hasNext())	
		{
			Map.Entry m = (Map.Entry)i.next(); 
			if(m.getKey().equals(ins))
			{
				Employee e = (Employee)m.getValue();
				System.out.println("Id = "+e.getId() +"\nName = "+ e.getName() +"\nSalary ="+ e.getSal()+"\nDesignation = "+e.getDesig()+"\nInsurance Scheme = "+m.getKey());
			}
		}
		System.out.print("\n\nenter scheme for which u want to delete employee details = ");
		ins = in.nextLine();
		hm.remove(ins);
		System.out.println("Successfully Deleted");
		System.out.println("Details after successful deletion");
		Set s2 = hm.entrySet();
		Iterator i1 = s2.iterator();
		while(i1.hasNext())
		{
			Map.Entry m = (Map.Entry)i1.next(); 
			Employee e = (Employee)m.getValue();
			System.out.println("\nId = "+e.getId() +"\nName = "+ e.getName() +"\nSalary ="+ e.getSal()+"\nDesignation = "+e.getDesig()+"\nInsurance Scheme = "+m.getKey());
			
		}
		}
	



}
