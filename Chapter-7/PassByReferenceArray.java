package chapter_7;

public class PassByReferenceArray {

	public static void main(String[] args) {
		
		int [] arr = {1, 2, 3};
		//print the items
		for(int j = 0; j < 3; j++) {
			System.out.println(arr[j]);
		}
		
		modifyArray(arr);
		
		for(int j = 0; j < 3; j++) {
			System.out.println(arr[j]);
		}

	}
	
	//design a method that takes an int array,
	//and multiplies each item in it by 10
	private static void modifyArray(int [] target ) {
		for(int i = 0; i < target.length; i++) {
			target[i] = target[i] * 10;
			
		}
		//not returning anything!
	}

}
