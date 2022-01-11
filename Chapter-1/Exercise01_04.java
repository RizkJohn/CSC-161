package chapter_1;

public class Exercise01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Object[][] table = new String[5][];
		table[0] = new String[] { "a", "a^2", "a^3" };
		table[1] = new String[] { "1", "1", "1" };
		table[2] = new String[] { "2", "4", "8" };
		table[3] = new String[] { "3", "9", "27" };
		table[4] = new String[] { "4", "16", "64" };
		for (final Object[] row : table) {
			System.out.format("%-5s%-8s%-1s\n", row);
		}
	}
}
