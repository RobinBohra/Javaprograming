package unit_01;

public class P2_Task02_ConstantsInJava {

	private static final float pi = 3.14f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int a = 10;
		// Static function cannot access non-static methods/functions

		// below we are directly calling the functions from static main...so we have to
		// make add(), multi() static.
		add(1, 2);
		multi(2, 3);

		// Now, below since we have created an object and through it we are calling the
		// fucntions...so we don't need
		// to make these functions static anymore.

		// NOTE - making too many static fucntions is not a good choice because static
		// functions are directly loaded
		// into the CPU prior to execution...and CPU does not have enough memory to
		// sustain all.
		Calculator obj = new Calculator(); // creating object
		
		System.out.println(obj.add(1, 2));
		System.out.println(obj.multi(2, 4));

	}

//since functions are outside class, we have to make them static in order to access them through static main
// or any other static function
	static int add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}

	static int multi(int a, int b) {
		int multiply = a * b;
		return multiply;
	}
}

class Calculator 
{
	// no need to make these methods static because they are insisde a class and can be access through call object.
	int add(int a, int b)
	{
		return (a+b);
	
	}
	int multi(int a, int b)
	{
		return (a*b);
	}
}
