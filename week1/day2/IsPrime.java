package week1.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		int input = 0, count = 0;
		Scanner sc = new Scanner(System.in); // have to give for user input in console
		try {
			System.out.println("Enter the number:");
			input = sc.nextInt(); // store the input entered in console to input
			if (input == 0 || input == 1)
				System.out.println(input + " is not a prime number");
			for (int i = 2; i < input; i++) // enters the loop only when input > 3
			{
				if (input % i == 0) {
					System.out.println(input + " is not a prime number");
					count++;
					break;
				}
			}
			if (count == 0 && input > 1) {
				System.out.println(input + " is a prime number");
			}

		}

		catch (InputMismatchException e) {
			System.out.println(input + " is not a valid interger number.");
		}
	}
}
