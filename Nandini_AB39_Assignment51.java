
package assignemt;

public class Ass51 {
public static void main(String[] args) {
	String s="aswatha bhasskar";
	char[] a=s.toCharArray();
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(Character.isSpaceChar(a[i])==true)
		{
			count=count+1;
	}
	}
	if(count==0)
	{
		System.out.println("string doesnot contain space");
	}
	else
	{
		System.out.println("string contain space");
	}
}
}

