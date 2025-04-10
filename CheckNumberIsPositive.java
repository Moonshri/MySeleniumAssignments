package week1.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		int version=0;
		Scanner sc=new Scanner(System.in);  //have to give for user input in console
		try {
		System.out.println("Enter the number:"); 
		version=sc.nextInt(); //store the input entered in console to input
	//	if(sc.hasNextInt()) {
			if(version>=0)
			System.out.println(version+" is a positive number.");
		else if (version<0) 
			System.out.println(version+" is not a positive number.");
		/*
		 * } else System.out.println(version+" is not an integer number.");
		 */
		}
		catch(InputMismatchException e) {
			System.out.println(version+" is not a valid interger number.");
		}
	}
}
