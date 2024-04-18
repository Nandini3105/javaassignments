package assignmentbasics;

public class Ass18 {
	public static void main(String[] args) {
		Ass18 m = new Ass18();
		add();
		add(4);
		add(4, 5);
		add(2, 'e');
		m.add("hi");
		m.add('e', 5);
		m.add(4, 4.5f);
		m.add("hi", 6);
	}

	static void add() {
		System.out.println("static method");
	}

	static void add(int a) {
		System.out.println("static method");
	}

	static void add(int a, int b) {
		System.out.println("static method");
	}

	static void add(int a, char c) {
		System.out.println("static method");
	}

	void add(String s) {
		System.out.println("non static method");
	}

	void add(int a, float b) {
		System.out.println("non static method");
	}

	void add(char a, int b) {
		System.out.println("non static method");
	}

	void add(String s, int a) {
		System.out.println("non static method");
	}
}
