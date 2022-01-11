package chapter_4;

public class DiceRoller {

	public static void main(String[] args) {

		// roll two die

		// use Math class, random method to generate values...
		int diceValue1 = (int) ((Math.random() * 6) + 1);
		int diceValue2 = (int) ((Math.random() * 6) + 1);

		System.out.println(diceValue1 + ", " + diceValue2);
	}

}
