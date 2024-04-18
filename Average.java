package assignmentbasics2;

public class Average {
public static void main(String[] args) {
	int sum=0;
	int avg;
	for(int i=1;i<=10;i++)
	{
		sum=sum+i;
	}
	System.out.println("sum from 1 to 10: "+ sum);
	avg=sum/10;
	System.out.println(avg);
}
}
