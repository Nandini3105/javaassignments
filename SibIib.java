package assignmentbasics;

public class SibIib {
static
{
	System.out.println("SIB");
}
{
	System.out.println("IIB");
}
SibIib()
{
	System.out.println("constructor");
}
SibIib(int a)
{
	System.out.println("parameterized constructor");
}
static
{
	System.out.println("SIB2");
}
{
	System.out.println("IIB2");
}
		
public static void main(String[] args) {
	SibIib s=new SibIib();
	new SibIib();
	new SibIib(10);
}

}
