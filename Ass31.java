package assignmentbasics2;
//Write a program for single level inheritance
class abc
{
	void add() {
		System.out.println("parent class ");
	}
}
public class Ass31 extends abc{
	void sub()
	{
		System.out.println("iam in child class");
	}
	public static void main(String[] args) {
		Ass31 a=new Ass31();
		a.add();
		a.sub();
	}

}
