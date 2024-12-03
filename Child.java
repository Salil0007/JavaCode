package basics;

class Parent {
	static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}

}

public class Child extends Parent {
	static void sub() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		sub();
		add();
	}
}
