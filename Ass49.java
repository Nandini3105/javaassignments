package assignmentbasics;
//In a string "sky is 441 !@#" 
//find out the number of special character,alphabet,numeric,spaces we have
public class Ass49 {
public static void main(String[] args) {
	String s="sky is 441 !@#";
	char a[]=s.toCharArray();
	for(int i=0;i<a.length;i++)
	{
		if(Character.isAlphabetic(a[i])==true)
		{
			System.out.println(a[i] + " is alphabet");
		}
		else if(Character.isDigit(a[i])==true)
		{
			System.out.println(a[i] + " is numeric ");
		}
		else if(Character.isSpaceChar(a[i])==true)
		{
			System.out.println(a[i]+" is space");
		}
		else
		{
			System.out.println(a[i]+" is special char");
		}
	}
}
}
