package chapter_7;

public class DefaultArrayValues {

	public static void main(String[] args) {
		
		//primitive arrays will have default values!
		int[] intArr = new int[5];
		double[] dblArr = new double[5];
		float[] fltArr = new float[5];
		long[] lngArr = new long[5];
		byte[] bytArr = new byte[5];
		char[] chrArr = new char[5];
		
		for(int k = 0; k< 5; k++) {
			System.out.print(intArr[k] + ",");
		}
		System.out.println();
		System.out.println("*******************");
		for(int k = 0; k< 5; k++) {
			System.out.print(dblArr[k] + ",");
		}
		System.out.println();
		System.out.println("*******************");
		for(int k = 0; k< 5; k++) {
			System.out.print(fltArr[k] + ",");
		}
		System.out.println();
		System.out.println("*******************");
		for(int k = 0; k< 5; k++) {
			System.out.print(lngArr[k] + ",");
		}
		System.out.println();
		System.out.println("*******************");
		for(int k = 0; k< 5; k++) {
			System.out.print(bytArr[k] + ",");
		}
		System.out.println();
		System.out.println("*******************");
		for(int k = 0; k< 5; k++) {
			System.out.print(chrArr[k] + ",");
		}

	}
	private static void printArray(int [] myArray) {
		for(int j = 0; j < myArray.length; j++) {
			System.out.print(myArray[j] + ",");
		}

	}
}
