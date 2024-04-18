package assignmentbasics2;
//Find the area and circumference of the circle,triangle
//,square,rectangle & trapezium using scanner class
import java.util.Scanner;

public class Ass30 {
	final float pi=3.14f;
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius of circle");
	int radius=sc.nextInt();
	Ass30 as=new Ass30();
	as.circle(radius);
	System.out.println("enter the side of a squaare");
	int val=sc.nextInt();
	as.square(val);
	System.out.println("enter length and breadth of rect");
	int a=sc.nextInt();
	int b=sc.nextInt();
	as.rect(a, b);
	int c=sc.nextInt();
	as.triangle(a, b, c);
	
}
void circle(int rad)
{
	float areaofcir,circumofcircle;
	areaofcir=pi*rad*rad;
	circumofcircle=2*pi*rad;
	System.out.println("area of circle "+ areaofcir);
	System.out.println("circumference of circle "+circumofcircle);
}
void square(int a)
{

	System.out.println("area of square "+ a*a);
	System.out.println("circumference of square "+4*a);
	
}
void rect(int l,int b)
{
	System.out.println("area of react "+ l*b);
	System.out.println("cir of rectangle "+2*(l+b));
}
void triangle(int a,int b,int c)
{
	System.out.println("area of triangle "+(b*c)/2);
	System.out.println("circum of rect "+ a+b+c);
}
}
