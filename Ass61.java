package assignjava;

//import org.openqa.selenium.chrome.ChromeDriver;

//WAP by upcasting from Experience Student class to Mentor Class and 
//downcasting from Experience Student Class to Student Class with four classes of Student, Experience Student,Mentor and Teacher
class Student
{
	void id()
	{
		System.out.println("123");
	}
	void name()
	{
		System.out.println("aswatha");
	}
}
public class Ass61 extends Student{
	void course()
	{
		System.out.println("automation");
	}
public static void main(String[] args) {
	
	
	Student s=new  Ass61();
	s.id();
	s.name();
	
}
}
