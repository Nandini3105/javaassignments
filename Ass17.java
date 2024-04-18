package assignmentbasics;
//Write a program with 2 Static method,2 Non-Static method,and one Constructor
public class Ass17 {
public static void main(String[] args) {
	Ass17 c=new Ass17();
	add();
	sub();
	c.mul();
	c.div();
}
static void add()
{
	int a=100;
	int b=200;
	System.out.println(a+b);
}
static void sub()
{
int a=50;
int b=20;
System.out.println(a-b);
}
void mul()
{
int a=50;
int b=20;
System.out.println(a*b);
}
void div()
{
	int a=50;
			int b=20;
	System.out.println(a/b);
}
 Ass17() {

	System.out.println("constructor");
}
}
