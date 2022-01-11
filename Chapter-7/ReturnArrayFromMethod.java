package chapter_7;

public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		
		
		String [] str1 = {"John", "Kelly", "Peter"};
		printArray(str1);
		String [] str2 = modifyArray(str1);
		printArray(str2);//modified copy
		printArray(str1);//original copy
		
		

	}
	
	private static String[] modifyArray(String[] source) {
		String [] temp = new String[source.length];
		
		for(int i = 0; i < source.length; i++) {
			temp[i] = source[i] + "001";
		}
		
		return temp;
		
	}
	
	
	private static void printArray(String [] source) {
		System.out.print("[ ");
		for(String value : source) {
			System.out.print(value + " ");
		}
		System.out.println("]");
	}

}
