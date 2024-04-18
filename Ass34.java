package assignmentbasics2;
//Write a program to call 
//the parent class constructor using super calling statement
class parent1
{
	parent1(int a)
	{
		System.out.println("parent class constructor");
	}
}
public class Ass34 extends parent1{
 Ass34()
{
	 super(7);
	System.out.println("child class constructor");
}
public static void main(String[] args) {
	Ass34 a=new Ass34();
	
}
}
