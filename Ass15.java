package assignmentbasics;
//How to call non-static method inside a main method
public class Ass15 {
public static void main(String[] args) {
	Ass15 n=new Ass15();
	n.add();
}
void add()
{
	int a=100;
	int b=100;
	int c=a+b;
	System.out.println(c);
}
}
