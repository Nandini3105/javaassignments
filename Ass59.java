package assignjava;

import graphql.org.antlr.v4.runtime.InputMismatchException;

//Write s program  for an exception with 5 catches and 1 finally block
public class Ass59 {
public static void main(String[] args) {
	int a[]=new int[3];
	try
	{
	a[0]=14;
	a[1]=1/0;
	a[2]=24;
	a[3]=12;
	}
	catch(InputMismatchException e1)
	{
		System.out.println("handled input exception");
	}
	catch(ArithmeticException e2)
	{
		System.out.println("handled arithmetic exception");
	}
	catch(ArrayIndexOutOfBoundsException e3)
	{
		System.out.println("handled exception");
	}
	finally
	{
		System.out.println("db close");
	}
}
}
