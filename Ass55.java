package assignemt;

public class Ass55 {
public static void main(String[] args) {
	for (int i=1;i<=1000;i++)
	{
		if((i%3==0)&&(i%5==0)==true)
		{
			System.out.println("sun and moon "+ i);
		}
		else if(i%3==0)
		{
			System.out.println("sun "+i);
		}
		else if(i%5==0)
		{
			System.out.println("moon "+i);
		}
	}
}
}
