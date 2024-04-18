package assignmentbasics;
//write a program for constructor overloading using 10 constructors
public class ConstructorOverloading {

	ConstructorOverloading() {

		System.out.println("hi");
	}

	ConstructorOverloading(int a) {
		System.out.println(a);
	}

	ConstructorOverloading(char c) {
		System.out.println(c);

	}

	ConstructorOverloading(float f) {
		System.out.println(f);
	}

	ConstructorOverloading(double d) {
		System.out.println(d);
	}

	ConstructorOverloading(String s) {
		System.out.println(s);
	}

	ConstructorOverloading(boolean s) {
		System.out.println(s);
	}

	ConstructorOverloading(int a, String s) {
		System.out.println(a + s);
	}

	ConstructorOverloading(float s, double d) {
		System.out.println(s + d);
	}

	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading();
		new ConstructorOverloading(7);
		new ConstructorOverloading('a');
		new ConstructorOverloading("aswatha");
		new ConstructorOverloading(1.4f);
		new ConstructorOverloading(14.22);
		new ConstructorOverloading(true);
		new ConstructorOverloading(12, "ashu");
		new ConstructorOverloading(1.2f, 24.0);

	}
}
