package assignmentbasics2;
//write a program for multiple level inheritance with 4 parents  using interface?
interface one
{
	void add();
}
interface b
{
	void sub();
}
interface c
{
	void mul();
}
interface d
{
	void div();
}
public class Ass39 implements one,b,c,d
{
public static void main(String[] args) {
	Ass39 as=new Ass39();
	as.add();
	as.sub();
	as.mul();
	as.div();
}
public void div() {
	
	System.out.println("div method");
}


public void mul() {
	
	System.out.println("mul method");
}


public void sub() {
	
	System.out.println("sub method");
}


public void add() {
	System.out.println("add method");
	
}
}
