package assignmentbasics;

import java.util.Date;
//write a program to get 10 days before the current time and 10 days after the current time using Date Class?

public class Ass42 {
public static void main(String[] args) {
	Date d=new Date();
	//long tendaysbefore=d.getTime();
	Date d1=new Date(d.getTime());
	System.out.println(d1);
	Date d3=new Date(d.getTime()+(1000*60*60*24*10));
	System.out.println(d3);
	Date d4=new Date(d.getTime()-(1000*60*60*24*10));
	System.out.println(d4);
	}
}
