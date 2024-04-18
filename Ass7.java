package assignmentbasics;
//Create a class and write 5 static methods each for addition, subtration,
//multiplication, devision and modules, call it in the main method
public class Ass7 {
	
public static void main(String[] args) {
	Ass7.add();
	Ass7.sub();
	Ass7.mul();
	Ass7.div();
	Ass7.mod();
}
static void add()
{
	int a=10;
	int b=20;
	System.out.println("addition "+(a+b));
}
static void sub()
{
	int a=10;
	int b=20;
	System.out.println("Subtraction "+(a-b));
}
static void mul()
{
	int a=10;
	int b=20;
	System.out.println("multiplication "+(a*b));
}
static void div()
{
	int a=10;
	int b=20;
	System.out.println("division "+(a/b));
}
static void mod()
{
	int a=10;
	int b=20;
	System.out.println("modulous "+(a%b));
}

}
