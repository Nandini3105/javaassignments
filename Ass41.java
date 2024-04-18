package assignmentbasics;
//write a program to check whether the given string is palindrome or not
public class Ass41 {
public static void main(String[] args) {
	String s="madams";
	String rev="";
char a[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
	rev=a[i]+rev;
}
System.out.println(rev);
if(s.equals(rev)==true)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
}
}
