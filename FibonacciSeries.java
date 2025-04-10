package week1.day2;

import java.util.Scanner;
import java.util.InputMismatchException;
public class FibonacciSeries {

	public static void main(String[] args) {
		int range=0,num1=0,num2=1,num3 = 0;
		Scanner sc=new Scanner(System.in);  //have to give for user input in console
		try {
		System.out.println("Enter the range number:"); 
		range=sc.nextInt(); //store the input entered in console to input
		System.out.println("The fibonaaci series of range "+range+" are:");
		System.out.println(num1);
		System.out.println(num2);
		for(int i=2;i<range;i++)
		{
			num3=num1+num2; //0,1,3,6
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}
	
	catch(InputMismatchException e)
		{
		System.out.println(range+" is not a valid range value.");
		}
}
}
