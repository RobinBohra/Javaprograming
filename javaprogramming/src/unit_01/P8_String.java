package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("1234321");
		String s2 = new String("123432a");
		String revs = "";

		obj.palindromeOrNot(s1, revs);
		obj.reverseOfAString(s2, revs);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s1, String revs) {
		int n = s1.length();
		int i = 0;
		for (i = n - 1; i >= 0; --i) {
			revs = revs + s1.charAt(i);
		}
		if (revs.toLowerCase().equals(s1.toLowerCase())) {
			System.out.println(s1 + " is a palidrome");
		} else
			System.out.println(s1 + " is not a palindrome");

	}

	void reverseOfAString(String s1, String revs) {

		int i = 0;
		int n = s1.length();

		for (i = n - 1; i >= 0; --i) {
			{
				revs = revs + s1.charAt(i);
			}
		}
		System.out.println(revs + " is the palindrome value of " + s1);

	}

	void stringEqualOrNot(String s1, String s2) {
		if (s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.println(s1 + " & " + s2 + " Both are palindrome of eachother");
		} else {
			System.out.println(s1 + " & " + s2 + " are not palindrome of eachother");
		}

	}
}