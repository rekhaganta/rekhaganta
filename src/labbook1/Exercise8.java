package labbook1;

import java.util.Scanner;

public class Exercise8 {
public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter the number:");
		
		int num = myObj.nextInt();
		myObj.close();
		
	
		if(PowerOfTwo(num)) {
			System.out.println("given number is a power of 2");
		}
		else{
			System.out.println("given number is not a power of two");
		}	
	}		

	private static boolean PowerOfTwo(int num) {
	
		if(num%2!=0) {
			return false;
		}
		else {
			for(int i=0;i<=num;i++) {
				if(Math.pow(2, i)==num)
					return true;
			}
		}
	return false;
}
	



}
