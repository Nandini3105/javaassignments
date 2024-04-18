package assignmentbasics;
//Write a program to check if gender equals to male or female.If it is male and check if age is greater than 18 or not.if it is greater than 18 then 
//the person is eligible to vote otherwise not eligible to vote.If it is female and check if age is greater than 18 or not.If the age is greater than 18 then the person is eligible to vote otherwise not eligible to vote 
public class Ass16 {
	public static void main(String[] args) {
		int age = 19;
		char gender = 'D';
		if (age >= 18) {
			if (gender == 'F') {
				System.out.println("eligible to vote");
			} else {
				if (gender == 'M') {
					System.out.println("eligible to vote");
				} else {
					System.out.println("not eligible to vote");
				}
			}
		}

		else {
			System.out.println("not eligible to vote");
		}
	}

}