package assignmentbasics;

import java.util.Arrays;
import java.util.Scanner;

//write a program in Array by getting the size of an array using Scanner class?
public class Ass45 {
public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter elements of array");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	
}
}
