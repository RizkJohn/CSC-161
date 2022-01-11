package chapter_7;

public class P7_2_6 {

	public static void main(String[] args) {
		/*a*/ double[] list = new double [10];
		/*b*/list[list.length - 1] = 5.5;
		/*c*/double sum = list[0] + list[1];
		/*d*/for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		/*e*/double min = list[0];
			for (int i = 1; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			} 
		}
		/*f*/ 

	}

}
