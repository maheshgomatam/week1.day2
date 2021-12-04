package week1.day2;

import java.util.Arrays;

public class MissingElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] numbers = { 11, 6, 4, 5, 7, 1 };
        Arrays.sort(numbers);
       // 1,4,5,6,7,11
       // 0,1,2,3,4,5
        int numbersArrayIndex = 0;
        for (int i = 0; i < numbers[numbers.length - 1]; i++) {
            if (i == numbers[numbersArrayIndex]) {
                numbersArrayIndex++;
            }
            else {
                System.out.println(i);
            }
        }		
	}

}
