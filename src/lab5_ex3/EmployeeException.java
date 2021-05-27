package lab5_ex3;

import java.util.Scanner;

public class EmployeeException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		int salary=sc.nextInt();
		sc.close();
		try
		{
			EmployeeSalary es=new EmployeeSalary(salary);
		}
		catch(SalaryException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

