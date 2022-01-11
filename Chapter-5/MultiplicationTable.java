package chapter_5;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 2;
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("---------------------");
		}
		
		System.out.println(Math.pow(2, 3));

	}

}
