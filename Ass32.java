package assignmentbasics2;
//Write a program for multi level inheritance by creating different class
class abcd
{
	void add()
	{
		System.out.println("add method");
	}
}
class xyz extends abcd
{
	void sub()
	{
		System.out.println("sub method");
	}
}

public class Ass32 extends xyz {
	public static void main(String[] args) {
		Ass32 a=new Ass32();
		a.add();
		a.sub();
		a.mul();
	}
	void mul()
	{
		System.out.println("mul method");
	}

}
