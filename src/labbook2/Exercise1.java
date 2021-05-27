package labbook2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	

		   int GetSecondSmallet(int n)
		   {
		    Scanner sc = new Scanner(System.in);
		    int a[],size,r=0,i;
		    //System.out.println("\n entr size ");

		    size  = sc.nextInt();
		    a= new int[size];
		    System.out.println("\n entr elements ");

		    for(i=0;i<size;i++)
		    {
		     a[i]=sc.nextInt();
		    }
		   
		    Arrays.sort(a);
		    System.out.println("\nThe sorted array is: ");
		    for (int num: a) {
		      System.out.print(num + " ");
		    }
		    System.out.println("\nSecond smallest element is " +a[1]);
		    return GetSecondSmallet(n);
		   }

		 public static void main(String[] args)
		 {
		  int n = 0;
		  Exercise1 e1 = new Exercise1();
		  e1.GetSecondSmallet(n);

		
		}
}
