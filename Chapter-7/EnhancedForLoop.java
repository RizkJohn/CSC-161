package chapter_7;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		//enhanced for loop example
		String [] names = {"John", "Peter", "Kelly"};
		
		//enhanced for loop cannot modify an array!!! it can only READ
		for(String name : names) {
			System.out.println(name);
		}
		
		int [] values = {1, 2, 3};
		
		//enhanced for loop
		for(int number : values) {
			System.out.println(number * 10);
		}

	}

}
