package assignmentbasics;
//Create an array of length 3 of int data type and add its value at the runtime
public class Ass44 {
public static void main(String[] args) {
	int a[]=new int[3];
	 a[0]=25;
	 a[1]=55;
	 a[2]=12;
	 int sum=0;
	 for(int i=0;i<a.length;i++)
	 {
		 sum=sum+a[i];
	 }
	 System.out.println(sum);
	
}
}
