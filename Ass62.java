package assignjava;
//Try to find area of circle using PI from Math.PI, and radius from Math.random in the for loop  for 10 times.
public class Ass62{
public static void main(String[] args) {
	double area;
	double r;
	double pi=Math.PI;
	for(int i=0;i<10;i++)
	{
		r=Math.random();
		area=pi*r*r;
		System.out.println("area of circle "+area);
	}
}
}
