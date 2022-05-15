package Unit_03;

import java.util.Scanner;

public class P14_ExceptionHanding {

	public static void main(String[] args) {
		Exceptions obj = new Exceptions();

		// obj.BasicException();
		// obj.HandleException();
		// obj.MultipleCatch();
		// obj.InputMisMatchException();
		// obj.StackOverFlow(10);
		// obj.OutOfBound();
		// obj.NullPointerException();
		// obj.UseOfThrow(15);
		/*
		 * try { obj.UseThrow_Finally(); }catch(Exception e) {
		 * System.out.println("Exception " + e.getMessage()); }
		 */
	}

}

class Exceptions {
	void BasicException() {
		int a = 10, b = 0;
		int c = a / b;// should be causing an ERROR since b is 0 an c will be resulting in infinity an
						// int type has a range less than infinity
		System.out.println("After the Exception " + c);
	}

	void HandleException() {
		// TRY block is used to try the statement.
		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println("Inside the try block " + c);
		} // We are using Arithmetic Exception here because the above statement will be
			// throwing a Arithmetic ERROR.

		catch (ArithmeticException e) {
			System.out.println("Exception Encountered and Handle !");
		} // CATCH block is used to catch the ERROR in the TRY block.
		System.out.println("Done !");
	}

	void MultipleCatch() {
		// While using multiple try catch block always use a Super Exception class and a
		// Sub Exception class
		try {
			int a = 10, b = 0;
			int c = a / b;
			System.out.println("Inside the TRY block ! " + c);
		} catch (ArithmeticException e) {
			System.out.println("Exception Encountered and Handled by Sub Arithematic Exception class");
		} catch (Exception e) {
			System.out.println("Exception Encountered and Handled by Super Exception class");
		}
		System.out.println("Done!");
	}

	void InputMisMatchException() {
		try {
			int i = 0;// This type of Exception Occurs when when the input is of different data type
						// then that of Expected
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			sc.close();
		} catch (Exception e) {
			System.out.println("Input mis match exception Encountered and Handle !");
		}
	}

	void StackOverFlow(int i) { // This is not any type of Exception ,but it is an ERROR
		try { // Even using a Try and Catch Block you can not handle this ERROR.
			while (i > 0) {
				StackOverFlow(++i);
			}
		} catch (Exception e) {
			System.out.println("Exception Encountered an Handled !");
		}
		System.out.println("Done!");
	}

	void OutOfBound() {
		try {
			int a[] = { 1, 2, 3 };
			System.out.println(a[10]);// This type of exception occurs when accessing a memory location which not
										// exits
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Encountered an Handled !");
		}
		System.out.println("Done!");
	}

	void NullPointerException() {
		try {
			String s = null;
			int len = s.length();

			System.out.println("length of the string" + len);
		} catch (NullPointerException e) {
			System.out.println("Exception Encountered an Handled !");
		}
		System.out.println("Done!");
	}

	// Throw is the Keyword used to throw a Exception Manually
	void UseOfThrow(int age) {
		try {
			if (age > 18) {
				System.out.println("Adult!");
			} else {
				throw new Exception("Exception is Thrown");
			}
		} catch (Exception e) {
			System.out.println("Exception Handled " + e.getMessage());
		}
	}

	void UseThrow_Finally() throws Exception {
		// throws Exception ---> this indicates that an Exception will be thrown for
		// sure.
		// Finally ---> this means that whatever is written inside the block will be
		// executed 100% even if ERROR occurs
		String sc;
		Scanner a = new Scanner(System.in);
		sc = a.next();

		if (sc.length() >= 6) {
			throw new Exception("String reached its limit !");
		} else {
			System.out.println(sc);
		}
	}
}