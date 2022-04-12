package unit_01;
import java.util.Arrays;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] array) {
		Arrays.sort(array);
		int i;
		int n = array.length;
		for(i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	void findTheDuplicateElements(int[] array) {
		int i;
		int n = array.length;
		int j;
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(array[j] == array[i]) {
					System.out.println(array[j] + " is a duplicate element");
				}
			}
		}
	
	}

	void findSecondLargestAndSecondSmallestElement(int[] array) {
		Arrays.sort(array);
		int i;
		int n = array.length;
		
		for(i=0;i<n-1;i++) {
			if(array[i] < array[i+1]) {
				System.out.println(array[i+1] + "");
				break;
			}
			if(array[i] == array[i+1]) {
				i++;
			}
		}
		for(i=n-1;i>0;--i) {
			if(array[i] > array[i-1]) {
				System.out.println(array[i-1] + "");
				break;
			}
			if(array[i] == array[i-1]) {
				i--;
			}
		}

	}

	void leftRotationInAnArray(int[] array) {
		
		int i;
		int m = 3;
		int n = array.length;
		for(i=0;i<m;i++) {
			int j,first;
			first = array[0];
			for(j=0;j<n-1;j++) {
				array[j] = array[j+1];
			}
			array[j] = first;
		
			System.out.println();
			System.out.println("Array after left rotation is : ");
			for(i=0;i<n;i++) {
			System.out.print(array[i] + " ");
			}
		}
		
		}

	

	void removeElementInArray(int[] arr) {
		// write code here!

	}

}
