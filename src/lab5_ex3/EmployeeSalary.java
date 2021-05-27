package lab5_ex3;

public class EmployeeSalary {
	int salary;
	EmployeeSalary(int salary) throws SalaryException{
		if(salary<3000)
		{
			throw new SalaryException("Youe salary is:"+salary+" which is below 3000");
		}
		else
		{
			this.salary=salary;
			System.out.println("Your Salary is:"+salary);
		}
	}
}

