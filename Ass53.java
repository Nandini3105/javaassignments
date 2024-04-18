package assignemt;

import java.util.Scanner;

public class Ass53 {
public static void main(String[] args) {
	int a,b,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a anb b");
	a=sc.nextInt();
	b=sc.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println("value of a after swapped "+a);
	System.out.println("value of a after swapped "+b);
	
	
}
}
