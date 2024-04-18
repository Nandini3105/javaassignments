package assignmentbasics;
//In  a string "mango123" check which character is numeric and which is alpha
public class Ass47 {
public static void main(String[] args) {
	String s="mango123";
	char a[]=s.toCharArray();
	for(int i=0;i<a.length;i++)
	{
		if(Character.isAlphabetic(a[i])==true)
		{
			System.out.println(a[i] +" is alphabetic");
		}
		if(Character.isDigit(a[i])==true)
		{
			System.out.println(a[i]+ " is numeric");
		}
	}
}
}
