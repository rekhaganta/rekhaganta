package labbook5;

import java.util.Scanner;

//public class A {
	class UserException extends Exception
	{
	  UserException()
	  {
	    
	    }
	    public String toString()
	    {
	   return ("exception occured");
	   }
	}
	class A
	{
	  public static void main(String args[])
	  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter");
	    String fullname=sc.nextLine();
	    
	    String words[]=fullname.split(" ");
	    String firstname="";
	    String lastname="";
	    for(int i=0;i<words.length-1;i++)
	    {
	      firstname=words[i];
	      lastname=words[i+1];
	    }
	    try
	    {
	      if(firstname==""&&lastname=="")
	      {
	        throw new UserException();
	      }
	      else
	      {
	        System.out.println("name is perfect");
	      }
	    }
	    catch(UserException e)
	    {
	    System.out.println(e+" "+"user defined");
	    }
	  }
	}

