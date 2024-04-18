package assignmentbasics2;

public class Ass22 {
	public static void main(String[] args) {
		final float pi=3.14f;
		int r=10;
		double areaofcircle,circumferenceofcircle;
		areaofcircle=pi*r*r;
		System.out.println("area of circle "+areaofcircle);
		circumferenceofcircle=2*pi*r;
		System.out.println("circumference of circle "+circumferenceofcircle);
		int a=20;
		int areaofsquare,circumferenceofsquare;
		areaofsquare=a*a;
		System.out.println("area of circle "+ areaofsquare);
		circumferenceofsquare=4*a;
		System.out.println("circumference of square "+ circumferenceofsquare);
		int length=40,breadth=20;
		int areaofrect,circumferenceofrect;
		areaofrect=length*breadth;
		System.out.println("area of rectangle  "+areaofrect);
		circumferenceofrect=2*(length+breadth);
		System.out.println("circumference of circle "+circumferenceofrect);
		int base=10,height=20;
		int areaoftriangle,circumoftriangle;
		areaoftriangle=(base*height)/2;
		System.out.println("area of triangle  "+areaoftriangle);
		int a1=10,b=20,c=30;
		circumoftriangle=a1+b+c;
		System.out.println("circumference of triangale  "+circumoftriangle);
		int a2=10,b1=5,h=2,c1=4,d=5;
		int areaoftrapezium=((a2*b)*h)/2;
		System.out.println("area of trapezium "+areaoftrapezium);
		int circumferoftrapezium=a2+b1+c1+d;
		System.out.println("circumference of trapezium "+circumferoftrapezium);
		
		
	}

}
