package lab5_exe2;

public class Employee {
	String firstName;
	String lastName;
	
	 Employee(String firstName, String lastName) throws NameNotFoundException {
	
		 if(firstName.isEmpty() && lastName.isEmpty())
		 {
			 throw new NameNotFoundException("Given name is Invalid! Please enter a valid name");
		 }
		 else
		 {
			 this.firstName=firstName;
			 this.lastName=lastName;
			 System.out.println("your first name is:"+firstName+" & lastName is:"+lastName);
		 }
		
	}
	 String isEmpty(){
		 return null;
	 }
}
