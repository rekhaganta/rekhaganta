package labbook2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
	static int[] removeDuplicates(int[] arr) {
		int len = arr.length;
		int newlen = 0;
		for(int i=0;i<len;i++) {
			if(arr[i] == '*') {
				newlen++;
			}
			for(int j = i+1;j<len;j++) {
				if (arr[i] == arr[j] && arr[i] != '*')
					arr[j] = '*';
			}
		}
		int resultLen = len - newlen;
		int newArray[] = new int[resultLen];
		for (int i = 0, index = 0; i < len; i++) {
			if (arr[i] != '*') {
				newArray[index] = arr[i];
				index++;
			}
		}
		Arrays.sort(newArray);
		int resultArray[] = new int[resultLen];
		for (int i = resultLen - 1, ind = 0; i >= 0; i--) {
			resultArray[ind] = newArray[i];
			ind++;
		}
		return resultArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements!");
		int len = sc.nextInt();
		int array[] = new int[len];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < len; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("The sorted array is " + Arrays.toString(removeDuplicates(array)));
		sc.close();
	}




}
