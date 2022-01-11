package chapter_3;

public class SwitchTest {

	public static void main(String[] args) {
		int x = 1, a = 3;
		System.out.println("if x: " + x);
		x = 2;
		switch (a) {
		case 1:
			x += 5;
			break;
		case 2:
			x += 10;
			break;
		case 3:
			x += 16;
			break;
		case 4:
			x += 34;
		default:
			System.out.println("invalid");
		}
		System.out.println("switch x: " + x);

	}

}
