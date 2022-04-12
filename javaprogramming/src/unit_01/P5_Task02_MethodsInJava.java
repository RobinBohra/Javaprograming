package unit_01;

public class P5_Task02_MethodsInJava {

	public static void main(String[] args) {
		
		ABC3 obj = new ABC3();
		
		//calling display method definition
		obj.display();
		obj.display2();
		System.out.println(obj.a);
	}

}

class ABC3{
	
	static int a = 10;
	static int b = 20;
	/* Actual method definition
	 * 
	 * DataType methodeName(DataType2 p1,DataType2 p2){
	 * method body;
	 * return value;
	 * }
	 */
	static void display() {
		int b = 10;
		int a = 10;
		System.out.println(b);
		System.out.println(a);
	}
	
	int display2(){
		System.out.println(a);
		
		//as a was a local method so we can not access it outside the method
		System.out.println(b);
		return a;
	}
}
