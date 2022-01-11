package chapter_7;

public class SearchInArray {

	public static void main(String[] args) {
		
		int [] values = {1, 2, 3, 4, 5};
		
		System.out.println(search(values, 3));
		System.out.println(search(values, 4));
		
		System.out.println(searchIndex(values, 3));
		System.out.println(searchIndex(values, 4));

	}
	
	//design a method that takes an int array, and a value,
	//and runs a search algorithm, and returns true if the array has the value, 
	//returns fails, if the array does not have the value..
	private static boolean search(int [] source, int target) {
		//walk through the array, and find the item
		//if found, return true, else return false...
		for(int value : source) {
			if(value == target) {
				return true;
			}
		}
		return false;
	}
	
	//return the index of item if found,
	//return -1 if not found...
	private static int searchIndex(int [] source, int target) {
		for(int i = 0; i < source.length; i++) {
			if(source[i] == target) {
				return i; //returns the index value
			}
		}
		return -1;
		
	}

}
