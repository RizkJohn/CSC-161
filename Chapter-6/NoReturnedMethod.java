package chapter_6;

public class NoReturnedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//design a methods that takes a string parameter,
	//and prints a message on screen using the string...
	//name: dialogBox
	//parameter: String message
	//return; nothing!!!
	//algorithm: print the message on the screen...
	//should I use this method ONLY in the class: YES --> private
	private static void dialogBox(String message) {
		System.out.println("*************");
		System.out.println(message);
		System.out.println("*************");

	}

}
