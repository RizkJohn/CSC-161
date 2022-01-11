package chapter_7;

public class CreateAnInitializedArray {

	public static void main(String[] args) {
		
		//declare, create and initialize an array
		
		int[] intArr = {100, 200, 300, 400, 500};
		
		String[] strArr = {"John", "Book", "Phone", "Kelly", "Peter"};
		
		for(int i = 0; i < 5; i++) {
			System.out.println(intArr[i] + " : " + strArr[i]);
		}
		
		int size = 1000;
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*1000);
			System.out.println(arr[i] + "/");
		}

	}

}
