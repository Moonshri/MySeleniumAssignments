package week1.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		int input=0,output=0,rev=0;
		Scanner sc=new Scanner(System.in);  //have to give for user input in console
		try {
		System.out.println("Enter the number:"); 
		input=sc.nextInt(); //store the input entered in console to input
		output=input;  // makes a duplicate of the number to reverse it.
		//for(int i=0;rem>0;i++)
		while(output>0)
		{
			int rem = output%10; // take remainder to use it in reverse number calculation
			output = output/10; // take quotient to calculate next output for the next remainder
			rev = rev*10 + rem%10; // to calculate the new reversed number
			
		}
   /*
	*StringBuffer input1 = new StringBuffer(String.valueOf(input)); //makes int value as  string value
	*StringBuffer rev1 = input1.reverse();
	*if(rev1.equals(input1))
	*
	*StringBuilder input2 = new StringBuilder();
	*input2.append(input);
	*StringBuilder rev2 = input2.reverse();
	*if(rev2.equals(input2))
	*/
		if(rev==input)
		System.out.println(input+" is a palindrome number.");
		else 
			System.out.println(input+" is not a palindrome number.");
		}
		catch(InputMismatchException e)
		{
			System.out.println(input+" is not a valid integer number");
		}
	}

}
