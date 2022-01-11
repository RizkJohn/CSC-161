package chapter_6;

public class Exercise06_13 {
	public static double m(int i) {
        double sum = 0;
        for(i = 1; i < 21; i++) {
        sum += i / (i+1.0);
        System.out.println(i + " " + sum);
        }
        return sum;
    }
    
    public static void main(String[] args) {
    		int i= 20;
            System.out.println(i + " " + m(i));
        }
    }   

