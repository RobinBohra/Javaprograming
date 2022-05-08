package unit_01;

public class P4_task04_ClassesAndObjectsInJava {

	public static void main(String[] args) {

		ABC2 obj = new ABC2();
		obj.display2();
		obj.display();

	}

}

class ABC2 {

	static int a = 10;
	static int b = 10;

	void display() {

		int b = 10;
		b++;

		System.out.println(a);
		System.out.println(b);
	}

	void display2() {
		System.out.println(a);
		// A is local variable so we can not access it outside the class
		System.out.println(b);
	}
}
