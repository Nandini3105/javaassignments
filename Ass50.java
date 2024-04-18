package assignmentbasics;

import java.util.Arrays;

//Copy the value of 1 array into another array using iteration
public class Ass50 {
public static void main(String[] args) {
	int arr1[]=new int[3];
	arr1[0]=1;
	arr1[1]=10;
	arr1[2]=245;
	int arr2[]=new int[3];
	for(int i=0;i<arr1.length;i++)
	{
		arr2[i]=arr1[i];
	}
	System.out.println(Arrays.toString(arr2));
		
	
	
}
}
