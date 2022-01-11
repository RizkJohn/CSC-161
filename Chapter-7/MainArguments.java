package chapter_7;

public class MainArguments {

	public static void main(String[] args) {
		
		//main arguments are saved in the string array called args
		//java MainArguments John Brown <enter>
		System.out.println("Hello " + args[0] + ", is your name really " + args[0]);

	}

}
