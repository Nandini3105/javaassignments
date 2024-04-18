package assignjava;
//Write a program to demonstrate this calling statement
public class Ass65 {
public static void main(String[] args) {
	Ass65 a=new Ass65();
}
Ass65()
{
	this(10);
	System.out.println("this calling statement 1");
}
Ass65(int a)
{
	this("nandini");
	System.out.println(a);
	System.out.println("this calling statement 2");
}
Ass65(String b)
{
	System.out.println(b);
	System.out.println("this calling statement 3");
}
}
