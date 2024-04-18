package assignmentbasics2;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
		int a=s.nextInt();
		byte b=s.nextByte();
		short c=s.nextShort();
		long d=s.nextLong();
		float e=s.nextFloat();
		double f=s.nextDouble();
		boolean g=s.nextBoolean();
		String h=s.next();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
