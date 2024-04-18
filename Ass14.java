package assignmentbasics;
//Write a program for NOT with AND and NOT with OR operator
public class Ass14 {
public static void main(String[] args) {
	int sal=2000;
	char gender='M';
	if(!((sal>100)&& (gender=='F')))
	{
		System.out.println("not eligible for loan");
	}
if(!((sal>2000) || (gender=='F')))
{
	System.out.println("not eligible");
}
}
}
