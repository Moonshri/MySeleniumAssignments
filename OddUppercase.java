package week3.day1;

import java.util.Scanner;

public class OddUppercase {

	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer str1 = new StringBuffer(str);
		for(int i=0;i<str.length()-1;i++)
		{
			Character c = str.charAt(i);
			if(i%2!=0)
			{
				str1.setCharAt(i, Character.toUpperCase(c));
			}
			else
			{
				str1.setCharAt(i, Character.toLowerCase(c));
			}
		}
		System.out.println("final "+str1);

	}

}
