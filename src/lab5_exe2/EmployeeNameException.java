package lab5_exe2;

import java.util.Scanner;

public class EmployeeNameException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first-name and last-name");
		String firstName=sc.nextLine();
		String lastName=sc.nextLine();
		sc.close();
		try
		{
			Employee e=new Employee(firstName,lastName);
			
		}
		catch(NameNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

