package week3.day1;

import java.util.Arrays;

public class ArrayMissingCompare {

	public static void main(String[] args) {
		int[] numbers = {5,4,3,2,8,6,1};
		Arrays.sort(numbers);  //1,2,3,4,6,7,8
		for (int i =0; i<=numbers[numbers.length-1];i++)//to check for 8 use i<numbers[last number]
		{
			if(i+1!=(numbers[i])) {   // 1!=
				System.out.println("missed "+ numbers[i]); // not working for all index numbers 
				break;
			}
		}
	}

}
