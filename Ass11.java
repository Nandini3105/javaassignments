package assignmentbasics;
//Write a programm to execute Nested if block
public class Ass11 {
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