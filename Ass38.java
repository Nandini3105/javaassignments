package assignmentbasics2;
//Write a program to replace surname to some other name using String functions.
public class Ass38 {
public static void main(String[] args) {
	String s="nandini bhasskar";
	System.out.println(s.replaceAll("nandini", "achu"));
	s=s.replaceAll("bhasskar", "aswatha");
	System.out.println(s);
}
}
