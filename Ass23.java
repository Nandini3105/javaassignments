package assignmentbasics2;
//"Write a program for 
/*Declaration and 
Intilization for Local and
Global Variables"*/
public class Ass23 {
static int a=10;
 int b=20;
public static void main(String[] args) {
Ass23 g=new Ass23();
	System.out.println(a);
System.out.println(g.b);
g.add();
}
void add()
{
	a=20;
    b=30;
	System.out.println(a);
	System.out.println(b);
}
}
