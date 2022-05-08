/*Abstract class - An abstract class must be declared using an abstract keyword.
 * 
 * Abstraction is the process of hiding the implementation details
 * and showing only functionality( function declaration ) to the users.
 * cannot make object of the abstract class directly,but through the derived class.
 * 
 * Abstract class may or may not contain Abstract methods.
 * 
 * In case of interface 100% abstract methods should be there
 * 
 * Final class-
 * The main purpose of final class is to prevent the class from being used.
 * if a class is marked as final then it can not be inherit by any other class.
 * you can not extend a final class.
 */
package Unit_02;

abstract class Bike {
	int a;

	Bike() {
		System.out.println("Inside the Bike constructor " + a + "\n");
	}

	abstract void run();

	void display() {
		System.out.println("This is Display method! ");
	}
}

class Honda extends Bike {
	void run() {
	}
}

public class P2_Tsak02_AbstractAndFinalClass {
	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.display();
		obj.run();

	}

}

final class Super{
	
	public int data = 30;
	void display(){
		System.out.println(data);
	}
	
}
/*
public class Sub extends Super{
	void display2() {
		display();
	}
}
*/