/*
 *  extends is the keyword to inherite another class
 *  
 *  -Subclass
 *  -Superclass
 *  -Code Re-Usability
 *  
 *  Types of inheritance in java :-
 *  -single inheritance
 *  -multilevel inheritance
 *  -hierarchical inheritance - same as a Tree
 *  -Hybrid Inheritance 
 *  
 *  constructor calls flow in inheritance
 *  -Default constructor
 *  -parameterized constructor
 */
package Unit_02;

public class P1_Task01_InheritenceInJava {

	public static void main(String[] args) {
		Three g = new Three();
		
		g.methodTwo();
		g.methodOne();
		g.methodThree();
		g.methodOne();
	}

}
class One{
	int a;
	One(int x){
		System.out.println(" First Constructor! ");
		
	}
	public void methodOne() {
		System.out.println(" First Method ! ");
	}
}

class Two extends One{
	int b;
	Two(int x){
		super(1);
		b = x;
		System.out.println(" Two ");
	}
	public void methodTwo() {
		System.out.println(" Second method !");
	}
}
class Three extends Two{
	int c;
	Three(){
		super(1);
		System.out.println(" Three constructor ! ");		
	}
	Three(int x){
		super(1);
		c = x;
		System.out.println(" Three ");
	}
	public void methodThree() {
		System.out.println(" Second Method ! ");
	}
}
