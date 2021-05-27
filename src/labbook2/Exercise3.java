package labbook2;

import java.util.Arrays;

public class Exercise3 {
	public static String reverseString(String str)
	{  
	    StringBuilder sb = new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	}  
	
	public static int[] getSort(int[] arr)
	{
		String[] Copy = new String[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			Copy[i] = Integer.toString(arr[i]);
			Copy[i] = reverseString(Copy[i]);
			arr[i] = Integer.parseInt(Copy[i]);
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String args[])
	{
		System.out.println("Sorted array:: ");
		int[] arr = {12,36,547,648,46,248};
		
		arr = getSort(arr);
		for(int i : arr)
			
			System.out.println(" "+i);
		
	}
}


