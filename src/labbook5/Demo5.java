package labbook5;

import java.util.Scanner;

public class Demo5 {
	
		 public static void main(String[] args) {
			  Scanner s = new Scanner(System.in);
			  System.out.print("Enter ur age : ");
			  int age = s.nextInt();
			  
			  try {
			   if(age < 15) 
			    throw new AgeException("age is Invalid ");
			   else
			    System.out.println(" age is Valid ");
			  }
			  catch (AgeException e) {
			   System.out.println(e);
			  }
			 }

	}


