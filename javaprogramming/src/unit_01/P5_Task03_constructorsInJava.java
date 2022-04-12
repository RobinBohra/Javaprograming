package unit_01;

/*it is called when an instance of class is created
 * At the time of calling a constructor , memory for the object is allocated in the memory
 * it is a special type of method which is used to initialize the object
 * every time an object is created using the new new() Keyword ,atleast one constructor is called
 * Types of constructors in java
 * -parameterized constructor 
 * -default constructor 
 */

public class P5_Task03_constructorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC4 obj = new ABC4();
		
		ABC4 obj1 = new ABC4();
		
		System.out.println(obj.a);
		System.out.println(obj1.a);

	}

}

class ABC4{
	int a;
	/*
	 * ClassName(Constructor parameters){
	 * all the class and instances variable can be initialized here
	 * }
	 */
	
	ABC4(){
		a=10;
	}
	
	ABC4(int a){
		this.a = a;
	}
	
	void display() {
		int b = 20;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	int display2() {
		System.out.println(a);
		//as a was a local variable so we can not access it outside the method
		System.out.println(b);
		return a;
	}
}
