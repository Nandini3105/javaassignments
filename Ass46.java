package assignmentbasics;

import java.util.Arrays;

//Check any 2 strings are anagram or not
public class Ass46 {
public static void main(String[] args) {
	String s1="silent";
	String s2="listen";
	char a1[]=s1.toCharArray();
	char a2[]=s2.toCharArray();
	Arrays.sort(a1);
	Arrays.sort(a2);
	if(Arrays.equals(a1,a2)==true)
	{
		System.out.println("anagaram of each other");
	}
	else
	{
		System.out.println("not anagram");
	}
}
}
