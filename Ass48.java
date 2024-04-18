package assignmentbasics;
//In a string "mango123" calculate how many are alpha and how many are numeric
public class Ass48 {
public static void main(String[] args) {
	String s="mango123";
	char a[]=s.toCharArray();
	int countofalpha=0,countofnumeric=0;
	for(int i=0;i<a.length;i++)
	{
		if(Character.isAlphabetic(a[i])==true)
		{
			countofalpha++;
		}
		if(Character.isDigit(a[i])==true)
		{
			countofnumeric++;
		}
	}
	System.out.println("count of alphabets "+ countofalpha);
	System.out.println("count of numeric "+ countofnumeric);
}
}
