package labbook3;

import java.util.Scanner;

public class Exe4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		String num = s.next();
		s.close();
		modifyNumber(num);
	}
	
	public static void modifyNumber(String num) {
		
		char[] ch = num.toCharArray();
		int diff =0,t=0;
		for(int i =0; i< ch.length-1 ; i++) {
			t =ch[i]-ch[i+1];
			diff =Math.abs(t);
			System.out.print(diff);
		}
	}
}
