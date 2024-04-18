package assignemt;

import java.util.Scanner;

public class Ass52 {
public static void main(String[] args) {
	int number,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	number=sc.nextInt();
	for(int i=number;i>0;i--)
	{
		fact=fact*i;
	}
	System.out.println("factorial of given number "+fact);
}
}
