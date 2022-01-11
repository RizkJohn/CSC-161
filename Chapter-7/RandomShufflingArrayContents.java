package chapter_7;

public class RandomShufflingArrayContents {

	public static void main(String[] args) {
		//use a double array
		double[] dblArr = new double[10];
		
		//insert the values
		for(int i = 0; i < dblArr.length; i++) {
			dblArr[i] = (double) (i * 10);
		}
		System.out.println("Original array:");
		printArray(dblArr);
		
		//shuffle the contents
		for(int j = 0; j < dblArr.length - 1; j++) {
			
			int k = (int)(Math.random() * dblArr.length);
			
			double temp = dblArr[j];
			dblArr[j] = dblArr[k];
			dblArr[k] = temp;
			
			System.out.println();
			System.out.println("******************");
			System.out.println("Shuffled array:");
			printArray(dblArr);
		}
	}
	
	private static void printArray(double[] dblArr) {
		for(int j = 0; j < dblArr.length; j++) {
			System.out.print(dblArr[j] + ", ");
		}

	}
}
