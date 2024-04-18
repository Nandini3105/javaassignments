package assignmentbasics2;

import java.util.Scanner;

public class ArithmeticOperators {
	static int num1;
	static int num2;
void add(int a,int b)
{
	System.out.println("sum of two numbers"+(a+b));
}
void sub(int a,int b)
{
	System.out.println("sub of two no"+(a-b));
}
void mul(int a,int b)
{
	System.out.println("mul of two no"+(a*b));
}
void div(int a,int b)
{
	System.out.println("div of two no"+(a/b));
}
void mod(int a,int b)
{
	System.out.println("mod of two no"+(a%b));
}
public static void main(String[] args) {
	ArithmeticOperators a=new ArithmeticOperators();
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of no1");
	num1=s.nextInt();
	System.out.println("enter value of no2");
	 num2=s.nextInt();
	a.add(num1, num2);
	a.sub(num1, num2);
	a.mul(num1, num2);
	a.div(num1, num2);
	a.mod(num1, num2);
	
	
}
}
