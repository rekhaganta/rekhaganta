package labbook2;

import java.util.Scanner;

public class Exercise2 {
	public static String[] sortString(String[] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		if(arr.length%2 !=0) {
			int mid = (arr.length / 2) + 1;
			for (int i = 0; i < mid; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (int i = mid + 1; i < arr.length; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		} else {
			int mid = arr.length / 2;
			for (int i = 0; i < mid; i++) {
				arr[i] = arr[i].toUpperCase();
			}
			for (int i = mid; i < arr.length; i++) {
				arr[i] = arr[i].toLowerCase();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Strings");
		int n = sc.nextInt();

		String[] arr = new String[n];
		System.out.println("Enter " + n + " strings");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}

		arr = sortString(arr);

		System.out.println("Sorted String Array");
		for (String value : arr) {
			System.out.println(value);
		}

	}

}

