package week3.day1;

import java.util.Arrays;

public class ArrayMissingElement {

	public static void main(String[] args) {
		int[] missing = {1,4,6,3,5,2,8};
		Arrays.sort(missing);
		int sum1=0,sum2=0;
		System.out.println(missing.length);
		for(int i=0;i<missing.length;i++)
		{
			sum1=sum1+missing[i]; // addition of all numbers in array
		}
		for(int i=1;i<=missing.length+1;i++)
		{
			sum2=sum2+i; // addition of all numbers from 1 to n.
		}
		System.out.println(sum2+" is sum2");
		System.out.println(sum1+" is sum1");
		System.out.println("missing number is "+(sum2-sum1));
	}
}
