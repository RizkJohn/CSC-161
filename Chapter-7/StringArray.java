package chapter_7;

import java.lang.reflect.Array;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] customers = new String[4];
		
		customers[0] = "John";
		customers[1] = "Jill";
		customers[2] = "Kelly";
		customers[3] = "Peter";
		
		for(int j = 0; j < 4; j++) {
			System.out.println("Hello " + customers[j] + "! How are you?");
		}
		
		System.out.println("The length of the Array customers[] is " + customers.length);
	}

}
