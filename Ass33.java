package assignmentbasics2;
//Write a program for Hierarchical level inheritance with 
//2 child classes by creating different class
class one1
{
	void add()
	{
		System.out.println("add method");
	}
}
class bcd extends one1
{
	void sub()
	{
		System.out.println("sub method");
	}
}

public class Ass33 extends one1{
	
	public static void main(String[] args) {
		Ass33 a= new Ass33();
		a.add();
		
		
		
	}

}
