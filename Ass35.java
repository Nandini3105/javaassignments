package assignmentbasics2;
//Write a program for method overriding 
class over
{
	void add()
	{
		System.out.println("parent class method");
	}
}
public class Ass35 extends over{
void add()
{
	System.out.println("child class metho");
	super.add();
	
}
public static void main(String[] args) {
	Ass35 a=new Ass35();
	a.add();
}
}
