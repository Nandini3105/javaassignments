package assignemt;

import java.util.Scanner;

public class Ass54 {
public static void main(String[] args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of a and b");
	a=sc.nextInt();
	b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("values of a after swaping "+a);
	System.out.println("values of b after swaping "+b);
}
}
