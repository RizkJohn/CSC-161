package chapter_4;

public class Concat {

	public static void main(String[] args) {
		String str1 = "John";
		String str2 = "Smith";
		
		String str3 = str1 + " " + str2;
		
		System.out.println(str3);
		
		String str4 = str1.concat(" ").concat(str2).toUpperCase();
		System.out.println(str4);
		

	}

}
