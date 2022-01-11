package chapter_7;

public class ReverseContentOfAnArray {

	public static void main(String[] args) {
		
		int [] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
		printArray(a1);
		System.out.println("*******************");
		int [] result = reverse(a1);
		printArray(result);

	}
	
	
	private static int[] reverse(int [] intArray) {
		int [] temp = new int[intArray.length];
		
		for(int i = intArray.length - 1; i >= 0; i--) {
			temp[Math.abs(i - (intArray.length - 1))] = intArray[i];
		}
		return temp;
		
	}
	
	
	private static void printArray(int [] source) {
		System.out.print("[ ");
		for(int value : source) {;
			System.out.print(value + " ");
		}
		System.out.println("]");
	}

}
