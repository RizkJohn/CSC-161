package chapter_7;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {

		//int [] values = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190};

		int [] values = {4, 2, 9, 10, 34, 12, 1, 99};
		//printArray(values);
		Arrays.sort(values);
		//printArray(values);
		System.out.println("");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter int value to search: ");
		int target = input.nextInt();

		int result = Arrays.binarySearch(values, target);
		System.out.println("Found at index: " + result);

	}




	//binary search
	//*************** THE ARRAY HAD TO BE AN ORDERED ARRAY ******
	private static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return high;
	}

	//private static void

}
