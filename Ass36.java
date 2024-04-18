package assignmentbasics2;
//write a program using this keyword to assign the value of a LV(local variable) to GV(global variable) 
public class Ass36 {
int a=100;
int b=20;
void add(int a,int b)
{
	this.a=a;
	this.b=b;
}
public static void main(String[] args) {
	Ass36 a=new Ass36();
	System.out.println(a.a);
	System.out.println(a.b);
	a.add(1000,2000);
	System.out.println(a.a);
	System.out.println(a.b);
}
}
