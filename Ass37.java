package assignmentbasics2;
//write a program using abstract class,abstract method ,
//concrete class and concrete method?
abstract class a1
{
	abstract void add();
	abstract void sub();
	void mul()
	{
		System.out.println("mul");
	}
}
public class Ass37 extends a1{
	void div()
	{
		System.out.println("div");
	}
public static void main(String[] args) {
	Ass37 a=new Ass37();
	a.add();
	a.sub();
	a.mul();
	a.div();
	
}
void add() {
	
	System.out.println("add");
}


void sub() {
	
	System.out.println("sub");
}
}
