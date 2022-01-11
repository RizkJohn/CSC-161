package chapter_7;

public class ArrayQuestion {

	public static void main(String[] args) {
		
		int [] arr1 = {10, 20, 30};
		int [] arr2 = new int[3];
		
		copyArrays(arr1, arr2);
		
		for(int k = 0; k < 3; k++) {
			System.out.println(arr2[k]);
		}

	}
	
	//design a method, which takes two int arrays,
	//and copies the content of the first to the second one.
	//note: both arrays have to be the same size
	
	private static void copyArrays(int [] source, int [] target) {
		for (int k = 0; k < source.length; k++) {
			target[k] = source[k];
		}
	}

}
