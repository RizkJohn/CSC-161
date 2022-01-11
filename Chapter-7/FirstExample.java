package chapter_7;
import java.util.*;
public class FirstExample {

	public static void main(String[] args) {
		
		//read 100 numbers, find their average
		Scanner input = new Scanner(System.in);
		
		//create an array of double numbers
		int [] theSource = new int [5];
		
		theSource[0] = 100;
		theSource[1] = 200;
		theSource[2] = 300;
		theSource[3] = 400;
		theSource[4] = 500;
		
		System.out.println(theSource[0]);
		System.out.println(theSource[1]);
		System.out.println(theSource[2]);
		System.out.println(theSource[3]);
		System.out.println(theSource[4]);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " : " + theSource[i]);
		}
		
		

	}

}
