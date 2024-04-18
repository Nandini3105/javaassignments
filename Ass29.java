package assignmentbasics2;

import java.util.Scanner;

public class Ass29 {
 void add(int a,int b)
{
	int sum;
	sum=a+b;
	System.out.println(sum);
}
void sub(int a,int b)
{
	int sub;
	sub=a-b;
	System.out.println(sub);
}
void mul(int a,int b)
{
	int mul;
	mul=a*b;
	System.out.println(mul);
}
void div(int a,int b)
{
	int div;
	div=a/b;
	System.out.println(div);
}
public static void main(String[] args) {
	Ass29 a=new Ass29();
	int num1,num2;
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of no1");
	num1=s.nextInt();
	System.out.println("enter value of no1");
	num2=s.nextInt();
a.add(num1, num2);
a.sub(num1, num2);
a.mul(num1, num2);
a.div(num1, num2);
	
	
}


}
